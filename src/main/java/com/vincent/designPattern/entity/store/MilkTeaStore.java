package com.vincent.designPattern.entity.store;

import com.vincent.designPattern.entity.box.Box;
import com.vincent.designPattern.entity.factory.IngredientFactory;
import com.vincent.designPattern.entity.milkTea.MilkTea;
import com.vincent.designPattern.entity.straw.Straw;

public abstract class MilkTeaStore {
    MilkTea milkTea;
    Straw straw;
    Box box;
    abstract void MilkTeaKit(String teaType);

    void do_something_else(){

    }
}
