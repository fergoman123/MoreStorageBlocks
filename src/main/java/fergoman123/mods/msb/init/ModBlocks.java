package fergoman123.mods.msb.init;

import fergoman123.mods.fergoutil.helper.RegisterHelper;
import fergoman123.mods.msb.block.*;
import fergoman123.mods.msb.item.ItemBlockDye;
import fergoman123.mods.msb.item.ItemBlockGoldApple;
import fergoman123.mods.msb.reference.Names;

public class ModBlocks
{
    public static final BlockMSB blockCharcoal = new BlockCharcoal();
    public static final BlockMSB blockApple = new BlockApple();
    public static final BlockMSB blockGoldApple = new BlockGoldApple();
    public static final BlockMSB blockDye = new BlockDye();
    public static final BlockMSB blockBook = new BlockBook();
    public static final BlockMSB blockEgg = new BlockEgg();
//    public static final BlockMSB blockEnderPearl = new BlockEnderPearl();
//    public static final BlockMSB blockEnderEye = new BlockEnderEye();
//    public static final BlockMSB blockLead = new BlockLead();
//    public static final BlockMSB blockSeeds = new BlockSeeds();
//    public static final BlockMSB blockStick = new BlockStick();
//    public static final BlockMSB blockLeather = new BlockLeather();

    public static void init()
    {
        RegisterHelper.registerBlock(blockCharcoal, Names.Blocks.blockCharcoal);
        RegisterHelper.registerBlock(blockApple, Names.Blocks.blockApple);
        RegisterHelper.registerBlock(blockGoldApple, ItemBlockGoldApple.class, Names.Blocks.blockGoldAppleName);
        RegisterHelper.registerBlock(blockDye, ItemBlockDye.class, Names.Blocks.blockDyeName);
        RegisterHelper.registerBlock(blockBook, Names.Blocks.blockBook);
        RegisterHelper.registerBlock(blockEgg, Names.Blocks.blockEgg);


    }
}
