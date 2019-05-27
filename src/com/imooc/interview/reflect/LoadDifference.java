package com.imooc.interview.reflect;

public class LoadDifference {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = Robot.class.getClassLoader();  // loadClass
        Class r = Class.forName("com.imooc.interview.reflect.Robot");  // forName
        System.out.println(r.getName());
    }
}
