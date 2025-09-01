package com.hehcrashes.gtmorehard.recipe.machineRecipe.expanded;

import static gregtech.api.enums.TierEU.RECIPE_UHV;
import static gregtech.api.enums.TierEU.RECIPE_UV;
import static net.minecraftforge.fluids.FluidRegistry.getFluidStack;

import com.hehcrashes.gtmorehard.GregTechMoreHard;
import com.hehcrashes.gtmorehard.common.recipeMap.GTCMRecipe;
import com.hehcrashes.gtmorehard.utils.TST_RecipeBuilder;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.util.GTUtility;

public class IntensifyChemicalDistorterRecipePool {

    private static final RecipeMap<?> ICD = GTCMRecipe.IntensifyChemicalDistorterRecipes;

    // spotless:off
    public static void loadRecipes() {

        GregTechMoreHard.LOG.info("IntensifyChemicalDistorterRecipePool loading recipes.");

        // region PBI
        TST_RecipeBuilder
            .builder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(19),
                GTUtility.copyAmountUnsafe(0, Materials.Potassiumdichromate.getDust(1)),
                Materials.Copper.getDust(16),
                GTUtility.copyAmountUnsafe(144, Materials.Zinc.getDust(1)))
            .fluidInputs(
                Materials.Dimethylbenzene.getFluid(144000),
                Materials.Chlorobenzene.getFluid(288000),
                Materials.SulfuricAcid.getFluid(144000),
                Materials.Hydrogen.getGas(1728000),
                Materials.Nitrogen.getGas(576000),
                Materials.Oxygen.getGas(2016000))
            .fluidOutputs(Materials.Polybenzimidazole.getMolten(216000), Materials.HydrochloricAcid.getFluid(288000))
            .noOptimize()
            .specialValue(9900)
            .eut(RECIPE_UV)
            .duration(96)
            .addTo(ICD);

        TST_RecipeBuilder
            .builder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(19),
                Materials.Copper.getDust(16),
                GTUtility.copyAmountUnsafe(144, Materials.Zinc.getDust(1)))
            .fluidInputs(
                Materials.PhthalicAcid.getFluid(144000),
                Materials.Chlorobenzene.getFluid(288000),
                Materials.SulfuricAcid.getFluid(144000),
                Materials.Hydrogen.getGas(1728000),
                Materials.Nitrogen.getGas(576000),
                Materials.Oxygen.getGas(1152000))
            .fluidOutputs(Materials.Polybenzimidazole.getMolten(216000), Materials.HydrochloricAcid.getFluid(288000))
            .specialValue(9900)
            .eut(RECIPE_UV)
            .duration(96)
            .addTo(ICD);

        TST_RecipeBuilder
            .builder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(18),
                GTUtility.copyAmountUnsafe(0, Materials.Potassiumdichromate.getDust(1)),
                GTUtility.copyAmountUnsafe(64 * 18, Materials.Carbon.getDust(1)),
                Materials.Copper.getDust(16),
                GTUtility.copyAmountUnsafe(144, Materials.Zinc.getDust(1)))
            .fluidInputs(
                Materials.Chlorobenzene.getFluid(288000),
                Materials.SulfuricAcid.getFluid(144000),
                Materials.Hydrogen.getGas(3168000),
                Materials.Nitrogen.getGas(576000),
                Materials.Oxygen.getGas(2016000))
            .fluidOutputs(Materials.Polybenzimidazole.getMolten(216000), Materials.HydrochloricAcid.getFluid(288000))
            .specialValue(9900)
            .eut(RECIPE_UV)
            .duration(96)
            .addTo(ICD);


        // endregion

    }
    public static void loadRecipePostInit() {
        // region H2O2
        GTValues.RA
            .stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(16))
            .fluidInputs(
                Materials.Hydrogen.getGas(1000*128),
                Materials.Oxygen.getGas(1000*128))
            .fluidOutputs(getFluidStack("fluid.hydrogenperoxide",1000*64))
            .specialValue(10800)
            .eut(RECIPE_UHV)
            .duration(32)
            .addTo(ICD);

        // endregion

    }
    // spotless:on
}
