package com.imooc.interview.basic.clone;

import java.io.IOException;
import java.io.OptionalDataException;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
public class DeepCopy2 {

    /**
     * 串行化拷贝
     * @param args
     */
    public static void main(String[] args) throws OptionalDataException,
            IOException, ClassNotFoundException {
        long t1 = System.currentTimeMillis();
        Professor2 p = new Professor2("wangwu", 50);
        Student2 s1 = new Student2("zhangsan", 18, p);
        Student2 s2 = (Student2) s1.deepClone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        // 学生1的教授不改变。
        System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }

}
