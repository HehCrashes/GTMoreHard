package com.hehcrashes.gtmorehard;

import com.hehcrashes.gtmorehard.util.TextHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hehcrashes.gtmorehard.devTools.PathHelper;
import com.hehcrashes.gtmorehard.loader.MachineLoader;
import com.hehcrashes.gtmorehard.loader.MaterialLoader;
import com.hehcrashes.gtmorehard.loader.RecipeLoader;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = GregTechMoreHard.MODID, version = Tags.VERSION, name = "GregTech More Hard", acceptedMinecraftVersions = "[1.7.10]")
public class GregTechMoreHard {

    public static final String MODID = "gtmorehard";
    public static final Logger LOG = LogManager.getLogger(MODID);

    public static final boolean isInDevMode = false;
    /**
     * The absolute Path of your workspace/resources folder.
     * It will be replaced by {@link PathHelper#initResourceAbsolutePath(boolean)}.
     * If it not work correctly, please operate it manually and disable
     * the{@link PathHelper#initResourceAbsolutePath(boolean)}.
     */
    public static String DevResource = "";
    @SidedProxy(
        clientSide = "com.hehcrashes.gtmorehard.ClientProxy",
        serverSide = "com.hehcrashes.gtmorehard.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        PathHelper.initResourceAbsolutePath(isInDevMode);
        TextHandler.initLangMap(isInDevMode);

        proxy.preInit(event);
        MaterialLoader.loadMaterial();// Load MaterialPool
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        MachineLoader.loadMachines();// Load Machines
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        TextHandler.serializeLangMap(isInDevMode);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
        RecipeLoader.loadRecipes();// Load Recipes
    }
}
