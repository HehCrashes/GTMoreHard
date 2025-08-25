package com.hehcrashes.gtmorehard.common.block;

import static com.hehcrashes.gtmorehard.common.block.blockClass.ItemBlockBase01.metaBlock01;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.hehcrashes.gtmorehard.common.block.blockClass.BlockBase01;
import com.hehcrashes.gtmorehard.common.block.blockClass.ItemBlockBase01;

import cpw.mods.fml.common.registry.GameRegistry;

public class blockList01 implements Runnable {

    // region Basic Blocks
    public static final Block MetaBlock01 = new BlockBase01("MetaBlock01", "MetaBlock01");

    // endregion
    // -----------------------
    // region Meta Blocks
    public static ItemStack TestMetaBlock01_0 = metaBlock01("TestMetaBlock01_0", 0);

    public static void initMetaBlocks() {

    }

    // endregion
    // -----------------------
    public static ItemStack get(ItemStack metaItem, int amount) {
        return new ItemStack(metaItem.getItem(), amount, metaItem.getItemDamage());
    }

    @Override
    public void run() {
        // register basic blocks
        GameRegistry.registerBlock(MetaBlock01, ItemBlockBase01.class, MetaBlock01.getUnlocalizedName());

        // init Meta information
        initMetaBlocks();
    }
}
