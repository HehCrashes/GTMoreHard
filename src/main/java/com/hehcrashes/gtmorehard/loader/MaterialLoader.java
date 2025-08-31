package com.hehcrashes.gtmorehard.loader;

import bartworks.API.WerkstoffAdderRegistry;
import com.hehcrashes.gtmorehard.common.init.BlockRegister;
import com.hehcrashes.gtmorehard.common.init.ItemRegister;
import com.hehcrashes.gtmorehard.common.material.MaterialPool;

/**
 * New Material Pool
 * Used Bartworks Werkstoff system
 *
 */
public class MaterialLoader {

    public static void load() {

        ItemRegister.registry();
        BlockRegister.registry();

        WerkstoffAdderRegistry.addWerkstoffAdder(new MaterialPool());
    }

}
