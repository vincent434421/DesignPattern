package com.vincent.designPattern.store;

import com.vincent.designPattern.entity.*;

/**
 * 这是最差的写法, 一个方法依赖了很多具体实现的类
 * 并且写了很多的if分支
 */
public class DependentStore {
    MilkTea createMilkTea(String storeType, String teaType) {
        MilkTea milkTea = null;
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
