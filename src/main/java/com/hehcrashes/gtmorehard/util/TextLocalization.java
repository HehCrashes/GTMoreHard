package com.hehcrashes.gtmorehard.util;

import static com.hehcrashes.gtmorehard.util.TextHandler.texter;

import net.minecraft.util.EnumChatFormatting;

// spotless:off

/**
 * <li>It's best to write here the texts that need auto generate en_US.lang .
 * <li>Or some usually used texts.
 */
public class TextLocalization {

    public static final String ModName = "GregTech More Hard";

    public static final String HeatCapacity = texter("Heat Capacity: ", "HeatCapacity");
    public static final String Kelvin = texter(" K", "Kelvin");
    public static final String BLUE_PRINT_INFO = texter(
        "Follow the" + EnumChatFormatting.BLUE
            + " Structure"
            + EnumChatFormatting.DARK_BLUE
            + "Lib"
            + EnumChatFormatting.GRAY
            + " hologram projector to build the main structure.",
        "BLUE_PRINT_INFO");
    public static final String textCasing = texter("Casing", "textCasing");
    public static final String textAnyCasing = texter("Any Casing", "textAnyCasing");
    public static final String textFrontCenter = texter("Front center", "textFrontCenter");
    public static final String textFrontBottom = texter("Front bottom", "textFrontBottom");
    public static final String textCenterOfLRSides = texter("Center area of left and right side", "textCenterOfLRSides");
    public static final String textCenterOfUDSides = texter("Center area of up and down side", "textCenterOfUDSides");
    public static final String StructureTooComplex = texter("The structure is too complex!", "StructureTooComplex");
    public static final String textCasingAdvIrPlated = texter("Advanced Iridium Plated Machine Casing", "textCasingAdvIrPlated");
    public static final String textCasingTT_0 = texter("High Power Casing", "textCasingTT_0");
    public static final String textAroundController = texter("Around the Controller", "textAroundController");

    public static final String textScrewdriverChangeMode = texter("Use screwdriver to change mode.", "textScrewdriverChangeMode");



}
// spotless:on
