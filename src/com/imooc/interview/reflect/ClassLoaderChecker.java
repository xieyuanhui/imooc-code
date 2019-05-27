package com.imooc.interview.reflect;

public class ClassLoaderChecker {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader("C:\\Users\\LitheLight\\Desktop\\", "myClassLoader");
        Class c = myClassLoader.findClass("Wali");
        System.out.println(c.getClassLoader());
        System.out.println(c.getClassLoader().getParent());
        System.out.println(c.getClassLoader().getParent().getParent());
        System.out.println(c.getClassLoader().getParent().getParent().getParent());
        c.newInstance();  // 触发static静态代码块
    }
}
