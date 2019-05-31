package com.imooc.interview.basic.test;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
public class Test {
    public static void main(String[] args)  {

    }

    public void test(int b) {
        int a = 10;
        new Thread(){
            @Override
            public void run() {
                System.out.println(a);
                System.out.println(b);
            };
        }.start();
    }
}
