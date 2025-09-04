package com.hehcrashes.gtmorehard.common.recipeMap;

import com.hehcrashes.gtmorehard.common.GTCMItemList;
import com.hehcrashes.gtmorehard.common.recipeMap.recipeMapFrontends.TST_GeneralFrontend;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.nei.formatter.HeatingCoilSpecialValueFormatter;

public class GTCMRecipe {

    public static final RecipeMap<TST_RecipeMapBackend> IntensifyChemicalDistorterRecipes = RecipeMapBuilder
        // At the same time , the localization key of the NEI Name
        // of this page.
        .of("gtcm.recipe.IntensifyChemicalDistorterRecipes", TST_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .neiSpecialInfoFormatter(HeatingCoilSpecialValueFormatter.INSTANCE)
        .progressBar(GTUITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(TST_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GTCMItemList.IntensifyChemicalDistorter.get(1))
                .setMaxRecipesPerPage(1))
        //.disableOptimize()
        .build();


}
