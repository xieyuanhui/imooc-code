package com.imooc.interview.basic.clone;

import java.io.Serializable;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
class Professor2 implements Serializable {
    /**
     * 串行化拷贝
     */
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Professor2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
