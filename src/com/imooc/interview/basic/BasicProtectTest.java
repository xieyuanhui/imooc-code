package com.imooc.interview.basic;

/**
 * @author LitheLight
 * @date 2019/5/29
 */
public class BasicProtectTest {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.DefFun();
        Basic.ProClass proClass = basic.new ProClass();
        Basic.DefClass defClass = basic.new DefClass();

    }
}
