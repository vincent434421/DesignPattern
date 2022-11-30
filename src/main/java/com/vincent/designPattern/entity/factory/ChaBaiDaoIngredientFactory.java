package com.vincent.designPattern.entity.factory;

import com.vincent.designPattern.entity.box.Box;
import com.vincent.designPattern.entity.box.IronBox;
import com.vincent.designPattern.entity.milkTea.ChaBaiDao_YuQiLin;
import com.vincent.designPattern.entity.milkTea.ChaBaiDao_yunibobo;
import com.vincent.designPattern.entity.milkTea.MilkTea;
import com.vincent.designPattern.entity.straw.IronStraw;
import com.vincent.designPattern.entity.straw.Straw;

public class  ChaBaiDaoIngredientFactory implements IngredientFactory{
    public MilkTea createMilkTea(String teaType){
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
    public Box createBox(){
        return new IronBox();
    }
    public Straw createStraw(){
        return new IronStraw();
    }
}
