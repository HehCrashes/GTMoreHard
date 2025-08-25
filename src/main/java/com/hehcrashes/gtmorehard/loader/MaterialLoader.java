package com.hehcrashes.gtmorehard.loader;

import com.github.bartimaeusnek.bartworks.API.WerkstoffAdderRegistry;
import com.hehcrashes.gtmorehard.common.block.blockList01;
import com.hehcrashes.gtmorehard.common.item.items.ItemList01;
import com.hehcrashes.gtmorehard.common.material.MaterialPool;
import com.hehcrashes.gtmorehard.loader.loadingUtils.AdderRegistry;

/**
 * New Material Pool
 * Used Bartworks Werkstoff system
 *
 */
public class MaterialLoader {

    public static void loadMaterial() {

        WerkstoffAdderRegistry.addWerkstoffAdder(new MaterialPool());
        AdderRegistry.addAdder(new ItemList01());
        AdderRegistry.addAdder(new blockList01());

        AdderRegistry.run();
    }

}
