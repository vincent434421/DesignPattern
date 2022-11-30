package com.vincent.designPattern.entity.store;

import com.vincent.designPattern.entity.box.Box;
import com.vincent.designPattern.entity.factory.IngredientFactory;
import com.vincent.designPattern.entity.milkTea.MilkTea;
import com.vincent.designPattern.entity.straw.Straw;

public class ALittle extends MilkTeaStore{
    IngredientFactory ingredientFactory;

    public ALittle() {
    }

    public ALittle(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 是否可以写入构造方法里
     * @param teaType 茶的类型
     */
    @Override
    protected void MilkTeaKit(String teaType) {
        this.milkTea = ingredientFactory.createMilkTea(teaType);
        this.box = ingredientFactory.createBox();
        this.straw = ingredientFactory.createStraw();
    }
}
