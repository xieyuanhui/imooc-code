package com.imooc.interview.basic.clone;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
class Student0 implements Cloneable {
    /**
     * 常量对象
     */
    String name;
    int age;
    /**
     * 学生1和学生2的引用值都是一样的。
     */
    Professor0 p;

    Student0(String name, int age, Professor0 p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    @Override
    public Object clone() {
        Student0 o = null;
        try {
            o = (Student0) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }

        return o;
    }
}
