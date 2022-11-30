package com.vincent.designPattern.entity.store;

import com.vincent.designPattern.entity.box.Box;
import com.vincent.designPattern.entity.factory.IngredientFactory;
import com.vincent.designPattern.entity.milkTea.MilkTea;
import com.vincent.designPattern.entity.straw.Straw;

public class ChaBaiDao extends MilkTeaStore{
    IngredientFactory ingredientFactory;

    public ChaBaiDao() {
    }

    public ChaBaiDao(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void MilkTeaKit(String teaType) {
        MilkTea milkTea = ingredientFactory.createMilkTea(teaType);
        Box box = ingredientFactory.createBox();
        Straw straw = ingredientFactory.createStraw();
    }
}
