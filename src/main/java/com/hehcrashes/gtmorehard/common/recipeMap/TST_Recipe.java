package com.hehcrashes.gtmorehard.common.recipeMap;

import gregtech.api.util.GTRecipe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class TST_Recipe extends GTRecipe {

    public TST_Recipe(ItemStack[] aInputs, ItemStack[] aOutputs, Object aSpecialItems, int[] aChances,
        FluidStack[] aFluidInputs, FluidStack[] aFluidOutputs, int aDuration, int aEUt, int aSpecialValue) {
        super(
            false,
            aInputs,
            aOutputs,
            aSpecialItems,
            aChances,
            aFluidInputs,
            aFluidOutputs,
            aDuration,
            aEUt,
            aSpecialValue);
    }

}
