package com.vincent.designPattern.entity.milkTea;

public class ALittle_molichuncha implements MilkTea {
    @Override
    public void prepare() {
        System.out.println("准备茉莉春茶");
    }

    @Override
    public void make() {
        System.out.println("制作茉莉春茶");
    }

    @Override
    public void box() {
        System.out.println("打包茉莉春茶");
    }
}
