package com.hehcrashes.gtmorehard.loader;


import com.hehcrashes.gtmorehard.common.GTCMItemList;
import com.hehcrashes.gtmorehard.machine.GT_TileEntity_IntensifyChemicalDistorter;
import com.hehcrashes.gtmorehard.utils.TextLocalization;

@SuppressWarnings("deprecation") // ignore deprecation for TextLocalization
public final class MachineLoader {

    // meta id 19029 has been assigned for AstralComputingArray
    // NuclearReactor = new TST_NuclearReactor(19029, "nucleareactor", "nuclear reactor").getStackForm(1);
    // GTCMItemList.NuclearReactor.set(IndistinctTentacle); // emm 应该是之前测试IndistinctTentacle用的

    public static void loadMachines() {


        // test
        // new Test_ModularizedMachine(19000, "TestMachine", "TestMachine");

        // region multi Machine controller

        GTCMItemList.IntensifyChemicalDistorter.set(
            new GT_TileEntity_IntensifyChemicalDistorter(
                19001,
                "NameIntensifyChemicalDistorter",
                TextLocalization.NameIntensifyChemicalDistorter));



            /*
             * LV=1
             * MV=2
             * HV=3
             * EV=4
             * IV=5
             * LuV=6
             * ZPM=7 8
             * UV=8 128
             * UHV=9 2,048
             * UEV=10 32,768
             * UIV=11 524,288
             * UMV=12 8,388,608
             * UXV=13 134,217,728
             * MAX=14 2,147,483,648
             */

        // endregion

    }

    public static void loadMachinePostInit() {

    }
}
