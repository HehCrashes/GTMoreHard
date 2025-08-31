package com.hehcrashes.gtmorehard.common.init;

import com.hehcrashes.gtmorehard.common.GTCMItemList;
import com.hehcrashes.gtmorehard.common.item.blockItem.TstMetaBlockItem;
import cpw.mods.fml.common.registry.GameRegistry;
import static com.hehcrashes.gtmorehard.common.init.TstBlocks.*;

public class BlockRegister {

    public static void registryBlocks() {

        GameRegistry.registerBlock(MetaBlock01, TstMetaBlockItem.class, MetaBlock01.unlocalizedName);
    }

    public static void registryBlockContainers() {

        // #tr tile.MetaBlock01.0.name
        // # Test Block
        // #zh_CN 测试方块
        GTCMItemList.TestMetaBlock01_0.set(MetaBlock01.registerVariant(0));

    }

    public static void registry() {
        registryBlocks();
        registryBlockContainers();
    }
}
