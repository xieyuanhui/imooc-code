package com.imooc.interview.basic.test;

import com.imooc.interview.basic.Basic;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
public class SubBasic extends Basic {

    private void test() {
        System.out.println(super.pro);
    }

    public static void main(String[] args) {
        Basic basic = new Basic();
        System.out.println(basic.pub);
        basic.pubFun();
    }
}
