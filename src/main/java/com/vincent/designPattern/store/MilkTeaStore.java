package com.vincent.designPattern.store;

import com.vincent.designPattern.entity.*;
import com.vincent.designPattern.factory.SimpleMilkTeaFactory;

public class MilkTeaStore {
    MilkTea milkTea = null;
    SimpleMilkTeaFactory factory;
    public MilkTeaStore(SimpleMilkTeaFactory factory) {
        this.factory = factory;
    }

    MilkTea createMilkTea(String storeType, String teaType) {
        milkTea = factory.create("ALitte","乌龙奶茶");
//        milkTea = new MilkTea();  将原来的new 语句改成使用工厂类来new一个需要的方法
        milkTea.prepare();
        milkTea.make();
        milkTea.box();
        return milkTea;
    }
}
