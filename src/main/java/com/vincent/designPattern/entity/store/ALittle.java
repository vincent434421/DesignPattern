package com.vincent.designPattern.entity.store;

import com.vincent.designPattern.entity.MilkTea.ALittle_molichuncha;
import com.vincent.designPattern.entity.MilkTea.ALittle_wulongnaicha;
import com.vincent.designPattern.entity.MilkTea.MilkTea;

public class ALittle extends MilkTeaStore {
    protected MilkTea createMilkTea(String teaType) {
        MilkTea milkTea = null;
        if (teaType.equals("茉莉春茶")) {
            milkTea = new ALittle_molichuncha();
        } else if (teaType.equals("乌龙奶茶")) {
            milkTea = new ALittle_wulongnaicha();
        } else {
            System.out.println("Error: invalid value");
            return null;
        }
        return milkTea;
    }
}
