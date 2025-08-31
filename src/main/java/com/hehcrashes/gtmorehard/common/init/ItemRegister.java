package com.hehcrashes.gtmorehard.common.init;

import com.hehcrashes.gtmorehard.common.GTCMItemList;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import static com.hehcrashes.gtmorehard.common.init.TstItems.*;
import static com.hehcrashes.gtmorehard.utils.TstUtils.tr;

public class ItemRegister {

    public static void registryItems() {
        Item[] itemsToReg = { MetaItem01 };

        for (Item item : itemsToReg) {
            GameRegistry.registerItem(item, item.unlocalizedName);
        }

    }

    // spotless:off
    public static void registryItemContainers() {

        /**
         * The order of arrangement is based on the registration order of the Minecraft Forge
         * */

        /*    ---Meta Item 01---    */

        // #tr item.MetaItem01.0.name
        // # Test Item
        // #zh_CN 测试物品
        // #tr tooltips.TestItem0.line1
        // # A test item, no use.
        // #zh_CN A test item, no use.
        GTCMItemList.TestItem0.set(MetaItem01.registerVariantWithTooltips(0, new String[]{tr("tooltips.TestItem0.line1")}));


        // endregion
    }

    // spotless:on
    public static void registry() {
        registryItems();
        registryItemContainers();
    }
}
