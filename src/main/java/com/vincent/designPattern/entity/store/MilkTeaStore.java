package com.vincent.designPattern.entity.store;

import com.vincent.designPattern.entity.MilkTea.MilkTea;

public abstract class MilkTeaStore {
    public MilkTea orderMilkTea(String teaType){
        MilkTea milkTea=null;
        milkTea= createMilkTea(teaType);
        milkTea.prepare();
        milkTea.make();
        milkTea.box();
        return milkTea;
    }
    protected abstract MilkTea createMilkTea(String teaType);
}
