package com.hehcrashes.gtmorehard.loader;

import com.hehcrashes.gtmorehard.GregTechMoreHard;
import com.hehcrashes.gtmorehard.recipe.machineRecipe.expanded.IntensifyChemicalDistorterRecipePool;


public class RecipeLoader {

    public static void loadRecipes() {
        IntensifyChemicalDistorterRecipePool.loadRecipes();
    }

    public static void loadRecipesPostInit() {
        IntensifyChemicalDistorterRecipePool.loadRecipePostInit();
    }

    public static boolean hasLoadedRecipesServerStarted = false;

    public static void loadRecipesServerStarted() {
        if (hasLoadedRecipesServerStarted) {
            GregTechMoreHard.LOG.info("Has loaded recipes server started.");
            return;
        }
        hasLoadedRecipesServerStarted = true;

    }

    public static void loadRecipemixin() {
        // new Mode3SimulatorFakeRecipe().loadRecipes();
    }
}
