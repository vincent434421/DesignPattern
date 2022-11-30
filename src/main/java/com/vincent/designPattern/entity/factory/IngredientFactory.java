package com.vincent.designPattern.entity.factory;

import com.vincent.designPattern.entity.box.Box;
import com.vincent.designPattern.entity.milkTea.MilkTea;
import com.vincent.designPattern.entity.straw.Straw;

public interface IngredientFactory {
    public MilkTea createMilkTea(String teaType);
    public Box createBox();
    public Straw createStraw();
}
