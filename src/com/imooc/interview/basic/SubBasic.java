package com.imooc.interview.basic;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
public class SubBasic extends Basic {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.DefFun();
        System.out.println(basic.def);
        ProClass proClass = basic.new ProClass();
    }
}
