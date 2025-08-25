package com.hehcrashes.gtmorehard.common;

import static com.hehcrashes.gtmorehard.common.item.itemAdders.ItemAdder01.MetaItem01;
import static com.hehcrashes.gtmorehard.util.TextHandler.texter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GTCMCreativeTabs {

    /**
     * Creative Tab for MetaItem01
     */
    public static final CreativeTabs tabMetaItem01 = new CreativeTabs(
        texter("GTCM Meta Items 1", "itemGroup.GTCM Meta Items 1")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return MetaItem01;
        }
    };

    /**
     * Creative Tab for MetaBlock01
     */
    public static final CreativeTabs tabMetaBlock01 = new CreativeTabs(
        texter("GTCM Meta Blocks 1", "itemGroup.GTCM Meta Blocks 1")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return MetaItem01;
        }
    };

    /**
     * Creative Tab for MetaBlock01
     */
    public static final CreativeTabs tabGTCMGeneralTab = new CreativeTabs(texter("GTCM", "itemGroup.GTCM")) {

        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return MetaItem01;
        }
    };

}
