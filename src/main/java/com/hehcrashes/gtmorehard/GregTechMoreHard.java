package com.hehcrashes.gtmorehard;

import com.hehcrashes.gtmorehard.loader.MaterialLoader;
import cpw.mods.fml.common.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

@Mod(
    modid = GregTechMoreHard.MODID,
    version = Tags.VERSION,
    name = "GregTech More Hard",
    acceptedMinecraftVersions = "[1.7.10]")
public class GregTechMoreHard {

    public static final String MODID = "gtmorehard";
    public static final Logger LOG = LogManager.getLogger(MODID);
    public static final String RESOURCE_ROOT_ID = "gtmorehard";

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
        proxy.preInit(event);
        MaterialLoader.load();
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void completeInit(FMLLoadCompleteEvent event) {
        proxy.complete(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
