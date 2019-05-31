package com.imooc.interview.basic;

/**
 * @author LitheLight
 * @date 2019/5/29
 */
public class Basic {

    private static String pri;
    public String pub;
    protected String pro;
    String def;

    private void priFun() {
        /**
         * 局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
         * 注意，局部内部类就像是方法里面的一个局部变量一样，是不能有public、protected、private以及static修饰符的。
         */
        class priInner {
            private int a;
        }
        PriClass priClass = new PriClass();
        ProClass proClass = new ProClass();
        DefClass defClass = new DefClass();
        PubClass pubClass = new PubClass();
        System.out.println("private fun");
    }

    public void pubFun() {
        PriClass priClass = new PriClass();
        ProClass proClass = new ProClass();
        DefClass defClass = new DefClass();
        PubClass pubClass = new PubClass();

        System.out.println("public fun" + priClass.priField);
    }

    protected void proFun() {
        PriClass priClass = new PriClass();
        ProClass proClass = new ProClass();
        DefClass defClass = new DefClass();
        PubClass pubClass = new PubClass();
        System.out.println("protected fun");
    }

    void DefFun() {
        PriClass priClass = new PriClass();
        ProClass proClass = new ProClass();
        DefClass defClass = new DefClass();
        PubClass pubClass = new PubClass();
        System.out.println("private fun" + priClass.priField + proClass.priField + defClass.priField + pubClass.priField);
    }

    /**
     * https://www.cnblogs.com/dolphin0520/p/3811445.html
     * 成员内部类
     * 无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）
     * 当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。可以用 外部类.this.成员变量访问
     * 成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，前提是必须存在一个外部类的对象。
     *  Outter.Inner inner = outter.new Inner();  //必须通过Outter对象来创建
     *  内部类可以拥有private访问权限、protected访问权限、public访问权限及包访问权限。比如上面的例子，如果成员内部类Inner用private修饰，则只能在外部类的内部访问，如果用public修饰，则任何地方都能访问；如果用protected修饰，则只能在同一个包下或者继承外部类的情况下访问；如果是默认访问权限，则只能在同一个包下访问。这一点和外部类有一点不一样，外部类只能被public和包访问两种权限修饰。我个人是这么理解的，由于成员内部类看起来像是外部类的一个成员，所以可以像类的成员一样拥有多种权限修饰。
     */
    private class PriClass {
        public String pubFiled;
        private String priField;
        protected String proFiled;
        String defField;
        private void test() {
            priFun();
            System.out.println(pri);
        }
    }

    protected class ProClass {
        public String pubFiled;
        private String priField;
        protected String proFiled;
        String defField;
    }

    static public class PubClass {
        public String pubFiled;
        private String priField;
        protected String proFiled;
        String defField;
        {
            System.out.println(pri);
        }
    }

    class DefClass {
        public String pubFiled;
        private String priField;
        protected String proFiled;
        String defField;
    }
}
