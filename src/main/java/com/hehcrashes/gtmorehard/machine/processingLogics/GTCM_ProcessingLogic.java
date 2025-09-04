package com.hehcrashes.gtmorehard.machine.processingLogics;

import com.hehcrashes.gtmorehard.machine.OverclockType;
import gregtech.api.logic.ProcessingLogic;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.ParallelHelper;

import javax.annotation.Nonnull;

public class GTCM_ProcessingLogic extends ProcessingLogic {

    /**
     * Override to tweak parallel logic if needed.
     */
    @Nonnull
    @Override
    protected ParallelHelper createParallelHelper(@Nonnull GTRecipe recipe) {
        return new GTCM_ParallelHelper().setRecipe(recipe)
            .setItemInputs(inputItems)
            .setFluidInputs(inputFluids)
            .setAvailableEUt(availableVoltage * availableAmperage)
            .setMachine(machine, protectItems, protectFluids)
            .setRecipeLocked(recipeLockableMachine, isRecipeLocked)
            .setMaxParallel(maxParallel)
            .setEUtModifier(euModifier)
            .enableBatchMode(batchSize)
            .setConsumption(true)
            .setOutputCalculation(true);
    }

    public GTCM_ProcessingLogic setOverclockType(OverclockType t) {
        setOverclock(t.timeReduction, t.powerIncrease);
        return this;
    }
}
