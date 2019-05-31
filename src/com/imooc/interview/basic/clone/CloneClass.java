package com.imooc.interview.basic.clone;

/**
 * @author LitheLight
 * @date 2019/5/30
 *
 * 对象克隆以及深拷贝和浅拷贝
 * 要说明的有两点：一是拷贝对象返回的是一个新对象，而不是一个引用。二是拷贝对象与用 new操作符返回的新对象的区别就是这个拷贝已经包含了一些原来对象的信息，而不是对象的初始信息。
 * 下面是一个典型的clone()代码
 *
 * Object类的clone()一个native方法，native方法的效率一般来说都是远高于java中的非native方法。这也解释了为 什么要用Object中clone()方法而不是先new一个类，然后把原始对象中的信息赋到新对象中，虽然这也实现了clone功能。对于第二点，也要 观察Object类中的clone()还是一个protected属性的方法。这也意味着如果要应用clone()方法，必须继承Object类，在 Java中所有的类是缺省继承Object类的，也就不用关心这点了。然后重写clone()方法。还有一点要考虑的是为了让其它类能调用这个clone 类的clone()方法，重写之后要把clone()方法的属性设置为public。
 *
 * 那么clone类为什么还要实现 Cloneable接口呢？稍微注意一下，Cloneable接口是不包含任何方法的！其实这个接口仅仅是一个标志，而且这个标志也仅仅是针对 Object类中clone()方法的，如果clone类没有实现Cloneable接口，并调用了Object的clone()方法（也就是调用了 super.Clone()方法），那么Object的clone()方法就会抛出CloneNotSupportedException异常。
 */
public class CloneClass implements Cloneable {

    public int anInt;

    @Override
    public Object clone() {
        CloneClass o = null;
        try {
            o = (CloneClass)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
