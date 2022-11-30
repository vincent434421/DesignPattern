package com.vincent.designPattern.entity.factory;

import com.vincent.designPattern.entity.box.Box;
import com.vincent.designPattern.entity.box.PaperBox;
import com.vincent.designPattern.entity.milkTea.ALittle_molichuncha;
import com.vincent.designPattern.entity.milkTea.ALittle_wulongnaicha;
import com.vincent.designPattern.entity.milkTea.MilkTea;
import com.vincent.designPattern.entity.straw.PaperStraw;
import com.vincent.designPattern.entity.straw.Straw;

public class
ALittleIngredientFactory implements IngredientFactory {
    @Override
    public MilkTea createMilkTea(String teaType) {
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

    @Override
    public Box createBox() {
        return new PaperBox();
    }

    @Override
    public Straw createStraw() {
        return new PaperStraw();
    }
}
