package fergoman123.mods.msb.init;

import fergoman123.mods.msb.block.*;
import fergoman123.mods.msb.item.ItemBlockDye;
import fergoman123.mods.msb.item.ItemBlockGoldApple;
import fergoman123.mods.msb.reference.Names.Blocks;

import static fergoman123.mods.fergoutil.helper.RegisterHelper.registerBlock;


public class ModBlocks
{
    public static final BlockMSB blockApple = new BlockApple();
    public static final BlockMSB blockArrow = new BlockArrow();
    public static final BlockMSB blockBlazeRod = new BlockBlazeRod();
    public static final BlockMSB blockBook = new BlockBook();
    public static final BlockMSB blockCarrot = new BlockCarrotStorage();
    public static final BlockMSB blockCharcoal = new BlockCharcoal();
    public static final BlockMSB blockDye = new BlockDye();
    public static final BlockMSB blockEgg = new BlockEgg();
    public static final BlockMSB blockEnderPearl = new BlockEnderPearl();
    public static final BlockMSB blockEnderEye = new BlockEnderEye();
    public static final BlockMSB blockGoldApple = new BlockGoldApple();
    public static final BlockMSB blockGunpowder = new BlockGunpowder();
    public static final BlockMSB blockNetherWart = new BlockNetherWartStorage();
    public static final BlockMSB blockPotato = new BlockPotatoStorage();
    public static final BlockMSB blockRottenFlesh = new BlockRottenFlesh();
    public static final BlockMSB blockSlimeball = new BlockSlimeball();
    public static final BlockMSB blockFireball = new BlockFireball();
    public static final BlockMSB blockSeeds = new BlockSeeds();
    public static final BlockMSB blockLead = new BlockLead();
    public static final BlockMSB blockLeather = new BlockLeather();
    public static final BlockMSB blockBucket = new BlockBucket();
    public static final BlockMSB blockStick = new BlockStick();

    public static void init()
    {
        registerBlock(blockApple, Blocks.blockApple);
        registerBlock(blockArrow, Blocks.blockArrow);
        registerBlock(blockBlazeRod, Blocks.blockBlazeRod);
        registerBlock(blockBook, Blocks.blockBook);
        registerBlock(blockCarrot, Blocks.blockCarrot);
        registerBlock(blockCharcoal, Blocks.blockCharcoal);
        registerBlock(blockDye, ItemBlockDye.class, Blocks.blockDyeName);
        registerBlock(blockEgg, Blocks.blockEgg);
        registerBlock(blockEnderPearl, Blocks.blockEnderPearl);
        registerBlock(blockEnderEye, Blocks.blockEnderEye);
        registerBlock(blockGoldApple, ItemBlockGoldApple.class, Blocks.blockGoldAppleName);
        registerBlock(blockGunpowder, Blocks.blockGunpowder);
        registerBlock(blockNetherWart, Blocks.blockNetherWart);
        registerBlock(blockPotato, Blocks.blockPotato);
        registerBlock(blockRottenFlesh, Blocks.blockRottenFlesh);
        registerBlock(blockSlimeball, Blocks.blockSlimeball);
        registerBlock(blockFireball, Blocks.blockFireball);
        registerBlock(blockSeeds, Blocks.blockSeeds);
        registerBlock(blockLead, Blocks.blockLead);
        registerBlock(blockLeather, Blocks.blockLeather);
        registerBlock(blockBucket, Blocks.blockBucket);
    }
}
