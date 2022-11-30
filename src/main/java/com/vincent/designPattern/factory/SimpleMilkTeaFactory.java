package com.vincent.designPattern.factory;

import com.vincent.designPattern.entity.*;

/**
 * 简单工厂模式不算一种真正的设计模式
 * 简单工厂模式就是把创建对象这件存粹的事情放到了工厂内
 * 通过制定不同类型的产品(奶茶)来创造出不同种类的奶茶
 */
public class SimpleMilkTeaFactory {

    public MilkTea create(String storeType, String teaType) {
        MilkTea milkTea =null;
        if(storeType.equals("ALitte")){
            if(teaType.equals("茉莉春茶")){
                milkTea=new ALittle_molichuncha();
            }else if(teaType.equals("乌龙奶茶")){
                milkTea=new ALittle_wulongnaicha();
            }
        }else if(storeType.equals("ChaBaiDao")){
            if(teaType.equals("淤泥波波")){
                milkTea=new ChaBaiDao_yunibobo();

            }else if(teaType.equals("玉麒麟")){
                milkTea=new ChaBaiDao_YuQiLin();
            }
        }else{
            System.out.println("Error: invalid value");
            return null;
        }

        return milkTea;
    }
}
