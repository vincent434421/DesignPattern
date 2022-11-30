package com.vincent.designPattern.entity.store;

import com.vincent.designPattern.entity.MilkTea.ChaBaiDao_YuQiLin;
import com.vincent.designPattern.entity.MilkTea.ChaBaiDao_yunibobo;
import com.vincent.designPattern.entity.MilkTea.MilkTea;

public class ChaBaiDao extends MilkTeaStore {
    protected MilkTea createMilkTea(String teaType) {
        MilkTea milkTea = null;
        if (teaType.equals("淤泥波波")) {
            milkTea = new ChaBaiDao_yunibobo();
        } else if (teaType.equals("玉麒麟")) {
            milkTea = new ChaBaiDao_YuQiLin();
        } else {
            System.out.println("Error: invalid value");
            return null;
        }
        return milkTea;
    }
}
