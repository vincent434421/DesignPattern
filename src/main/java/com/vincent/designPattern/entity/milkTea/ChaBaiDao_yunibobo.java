package com.vincent.designPattern.entity.milkTea;


public class ChaBaiDao_yunibobo implements MilkTea {
    @Override
    public void prepare() {
        System.out.println("准备淤泥波波");
    }

    @Override
    public void make() {
        System.out.println("制作淤泥波波");
    }

    @Override
    public void box() {
        System.out.println("打包淤泥波波");
    }
}
