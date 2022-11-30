package com.vincent.designPattern.entity.milkTea;

public class ALittle_wulongnaicha implements MilkTea {
    @Override
    public void prepare() {
        System.out.println("准备乌龙奶茶");
    }

    @Override
    public void make() {
        System.out.println("制作乌龙奶茶");
    }

    @Override
    public void box() {
        System.out.println("打包乌龙奶茶");
    }
}
