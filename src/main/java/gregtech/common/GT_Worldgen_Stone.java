package gregtech.common;

import gregtech.api.GregTech_API;
import gregtech.api.objects.XSTR;
import gregtech.api.util.GT_Log;
import gregtech.api.world.GT_Worldgen_Ore;
import gregtech.common.blocks.GT_Block_Ores_Abstract;
import gregtech.common.blocks.GT_TileEntity_Ores;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Random;

import static gregtech.api.enums.GT_Values.debugStones;

public class GT_Worldgen_Stone
        extends GT_Worldgen_Ore {

    public Hashtable<Long, StoneSeeds> validStoneSeeds = new Hashtable(1024);

    class StoneSeeds {
        public boolean mExists;

        StoneSeeds( boolean exists ) {
            mExists = exists;
        }
    };

    class ValidSeeds {
        public int mX;
        public int mZ;
        ValidSeeds( int x, int z) {
            this.mX = x;
            this.mZ = z;
        }
    };
    public GT_Worldgen_Stone(String aName, boolean aDefault, Block aBlock, int aBlockMeta, int aDimensionType, int aAmount, int aSize, int aProbability, int aMinY, int aMaxY, Collection<String> aBiomeList, boolean aAllowToGenerateinVoid) {
        super(aName, aDefault, aBlock, aBlockMeta, aDimensionType, aAmount, aSize, aProbability, aMinY, aMaxY, aBiomeList, aAllowToGenerateinVoid);
    }

    public boolean executeWorldgen(World aWorld, Random aRandom, String aBiome, int aDimensionType, int aChunkX, int aChunkZ, IChunkProvider aChunkGenerator, IChunkProvider aChunkProvider) {
        XSTR stoneRNG = new XSTR();
        ArrayList<ValidSeeds> stones = new ArrayList();

        if ( !isGenerationAllowed(aWorld, aDimensionType, this.mDimensionType)) {
            return false;
        }
        if ( !(this.mBiomeList.isEmpty() || this.mBiomeList.contains(aBiome)) ) {
            return false;
        }
        int windowWidth = (mSize/8)/16 + 1; // Width of chunks to check for a potential stoneseed (I think the real size of the balls is mSize/8, but the code below is difficult to understand)
        // Check stone seeds to see if they have been added
        for( int x = aChunkX/16 - windowWidth; x < (aChunkX/16 + windowWidth + 1); x++ ) {
            for( int z = aChunkZ/16 - windowWidth; z < (aChunkZ/16 + windowWidth + 1); z++ ) {
                long hash = (( (long)x << 32) | ( (long)z & 0x00000000ffffffffL ));
                if( !validStoneSeeds.containsKey(hash) ) {
                    // Determine if RNG says to add stone at this chunk
                    stoneRNG.setSeed((long)aWorld.getSeed() ^  hash);
                    if ( (this.mProbability <= 1) || (aRandom.nextInt(this.mProbability) == 0) ) {
                        // Add stone at this chunk
                        validStoneSeeds.put( hash, new StoneSeeds(true) );
                        // Add to generation list
                        stones.add( new ValidSeeds(x,z) );
                        if (debugStones) GT_Log.out.println(
                                "New stoneseed x="+x+
                                        " z="+z+
                                        " mSize="+mSize
                        );
                    } else {
                        validStoneSeeds.put( hash, new StoneSeeds(false) );
                    }
                } else {
                    // This chunk has already been checked, check to see if a boulder exists here
                    if( validStoneSeeds.get(hash).mExists ) {
                        // Add to generation list
                        stones.add( new ValidSeeds(x,z) );
                    }
                }
            }
        }

        boolean result = true;
        if (stones.size() == 0) {
            result = false;
        }
        // Now process each oreseed vs this requested chunk
        for( ; stones.size() != 0; stones.remove(0) ) {
            int x = stones.get(0).mX*16;
            int z = stones.get(0).mZ*16;

            stoneRNG.setSeed((long)aWorld.getSeed() ^  (( (long)x << 32) | ( (long)z & 0x00000000ffffffffL )));

            for (int i = 0; i < this.mAmount; i++) {
                int tX = x + stoneRNG.nextInt(16);
                int tY = this.mMinY + stoneRNG.nextInt(this.mMaxY - this.mMinY);
                int tZ = z + stoneRNG.nextInt(16);
                if ((this.mAllowToGenerateinVoid) || (!aWorld.getBlock(tX, tY, tZ).isAir(aWorld, tX, tY, tZ))) { // Causes slight amount of worldgen cascade since it may load a chunk that is far away.
                    float math_pi = 3.141593F;//FB: CNT - CNT_ROUGH_CONSTANT_VALUE
                    float var6 = stoneRNG.nextFloat() * math_pi;
                    float var1d = this.mSize / 8.0F;
                    int var2d = tX + 8;
                    int var3d = tZ + 8;
                    int var4d = tY - 2;
                    float mh_s_0 = MathHelper.sin(var6) * var1d;
                    float mh_c_0 = MathHelper.cos(var6) * var1d;
                    float var7 = var2d + mh_s_0;
                    float var11 = var3d + mh_c_0;
                    int var15r = stoneRNG.nextInt(3);
                    int var17r = stoneRNG.nextInt(3);
                    int var15 = var4d + var15r;
                    int mh_n_4=var17r - var15r;
                    float mh_n_0 = -2*mh_s_0;
                    float mh_n_1 = -2*mh_c_0;
                    for (int var19 = 0; var19 <= this.mSize; var19++) {
                        float var5d = var19 / this.mSize;
                        float var20 = var7 + mh_n_0 * var5d;
                        float var22 = var15 + mh_n_4 * var5d;
                        float var24 = var11 + mh_n_1 * var5d;
                        float var6d = var19 * math_pi / this.mSize;
                        float var26 = stoneRNG.nextFloat() * this.mSize / 16.0F;
                        float var28 = ((MathHelper.sin(var6d) + 1.0F) * var26 + 1.0F) / 2.0F;
                        int tMinX = MathHelper.floor_float(var20 - var28);
                        int tMinY = MathHelper.floor_float(var22 - var28);
                        int tMinZ = MathHelper.floor_float(var24 - var28);
                        int tMaxX = MathHelper.floor_float(var20 + var28);
                        int tMaxY = MathHelper.floor_float(var22 + var28);
                        int tMaxZ = MathHelper.floor_float(var24 + var28);

                        int wX = Math.max( tMinX, aChunkX + 8);
                        int eX = Math.min( tMaxX, aChunkX + 8 + 16 );

                        int sZ = Math.max( tMinZ, aChunkZ + 8);
                        int nZ = Math.min( tMaxZ, aChunkZ + 8 + 16 );

                        for (int iX = wX; iX < eX; iX++) {
                            float var39 = (iX + 0.5F - var20) / (var28);
                            float var10d = var39 * var39;
                            if (var10d < 1.0F) {
                                for (int iY = tMinY; iY <= tMaxY; iY++) {
                                    float var42 = (iY + 0.5F - var22) / (var28);
                                    float var12d = var10d + var42 * var42;
                                    if (var12d < 1.0F) {
                                        for (int iZ = sZ; iZ < nZ; iZ++) {
                                            float var45 = (iZ + 0.5F - var24) / (var28);
                                            if (var12d + var45 * var45 < 1.0F) {
                                                Block tTargetedBlock = aWorld.getBlock(iX, iY, iZ);
                                                if (tTargetedBlock instanceof GT_Block_Ores_Abstract) {
                                                    TileEntity tTileEntity = aWorld.getTileEntity(iX, iY, iZ);
                                                    if ((tTileEntity instanceof GT_TileEntity_Ores)) {
                                                        if (tTargetedBlock != GregTech_API.sBlockOres1) {
                                                            ((GT_TileEntity_Ores) tTileEntity).convertOreBlock(aWorld, iX, iY, iZ);
                                                        }
                                                        ((GT_TileEntity_Ores)tTileEntity).overrideOreBlockMaterial(this.mBlock, (byte) this.mBlockMeta);
                                                    }
                                                } else if (((this.mAllowToGenerateinVoid) && (aWorld.getBlock(iX, iY, iZ).isAir(aWorld, iX, iY, iZ))) || ((tTargetedBlock != null) && ((tTargetedBlock.isReplaceableOreGen(aWorld, iX, iY, iZ, Blocks.stone)) || (tTargetedBlock.isReplaceableOreGen(aWorld, iX, iY, iZ, Blocks.end_stone)) || (tTargetedBlock.isReplaceableOreGen(aWorld, iX, iY, iZ, Blocks.netherrack)) || (tTargetedBlock.isReplaceableOreGen(aWorld, iX, iY, iZ, GregTech_API.sBlockGranites)) || (tTargetedBlock.isReplaceableOreGen(aWorld, iX, iY, iZ, GregTech_API.sBlockStones))))) {
                                                    aWorld.setBlock(iX, iY, iZ, this.mBlock, this.mBlockMeta, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}