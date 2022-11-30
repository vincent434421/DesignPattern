package com.vincent.designPattern.entity;

public class ChaBaiDao_YuQiLin implements MilkTea {
    @Override
    public void prepare() {
        System.out.println("准备玉麒麟");
    }

    @Override
    public void make() {
        System.out.println("制作玉麒麟");
    }

    @Override
    public void box() {
        System.out.println("打包玉麒麟");
    }
}
