package com.hehcrashes.gtmorehard.Recipe.machineRecipe;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.interfaces.IItemContainer;

public class GTCMMachineRecipePool {

    public static void loadGTCMMachineRecipes() {

        // init Variables
        // final Fluid solderIndalloy = GTPlusPlus.isModLoaded() ? FluidRegistry.getFluid("molten.indalloy140")
        // : FluidRegistry.getFluid("molten.solderingalloy");
        Fluid solderIndAlloy = FluidRegistry.getFluid("molten.indalloy140");

        Fluid solderPlasma = FluidRegistry.getFluid("molten.mutatedlivingsolder");

        IItemContainer eM_Power = com.github.technus.tectech.thing.CustomItemList.eM_Power;

        // test machine recipe
        /*
         * GT_Values.RA.stdBuilder()
         * .itemInputs(GT_Utility.getIntegratedCircuit(1))
         * .fluidInputs(
         * Materials.Hydrogen.getGas(1000),
         * Materials.Helium.getGas(1000),
         * WerkstoffLoader.Neon.getFluidOrGas(1000),
         * Materials.Argon.getGas(1000),
         * WerkstoffLoader.Krypton.getFluidOrGas(1000),
         * WerkstoffLoader.Xenon.getFluidOrGas(1000),
         * Materials.Radon.getGas(1000))
         * .fluidOutputs(MaterialPool.TestingMaterial.getMolten(144))
         * .noItemInputs()// GTNH Version 2.4.1+ don't need call this method , BUT!
         * .specialValue(11451) // set special value, like HeatCapacity is the special value of EBF recipes
         * .noOptimize() // disable the auto optimize of GT Machine recipes
         * .eut(1919810)
         * .duration(114514 * 20)
         * .addTo(GTCMRecipe.instance.IntensifyChemicalDistorterRecipes);
         */

        /*
         * 2.4.0 and earlier need call these methods:
         * noItemInputs(); noItemOutputs(); noFluidInputs(); noFluidOutputs();
         * So had better call.
         */

        // endregion
    }
}
