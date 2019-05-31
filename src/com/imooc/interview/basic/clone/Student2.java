package com.imooc.interview.basic.clone;

import java.io.*;

/**
 * @author LitheLight
 * @date 2019/5/30
 */
class Student2 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 常量对象
     */
    String name;
    int age;
    /**
     * 学生1和学生2的引用值都是一样的。
     */
    Professor2 p;

    Student2(String name, int age, Professor2 p) {
        this.name = name;
        this.age = age;
        this.p = p;
    }

    /**
     * 要想序列化对象，必须先创建一个OutputStream，然后把它嵌入ObjectOutputStream。这时就能用writeObject()方法把对象写入OutputStream。读的时候需要把InputStream嵌到ObjectInputStream中，然后再调用readObject()方法。不过这样读出来的只是一个Object的reference，因此，在用之前，还要下转型。
     *
     * 对象序列化不仅能保存对象的副本，而且会跟着对象中的reference把它所引用的对象也保存起来，然后再继续跟踪那些对象的reference，以此类推。这种情形常被称作”单个对象所联结的‘对象网’ “。
     *
     * 但是串行化却很耗时，在一些框架中，我们便可以感受到，它们往往将对象进行串行化后进行传递，耗时较多。
     * @return
     * @throws IOException
     * @throws OptionalDataException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, OptionalDataException,
            ClassNotFoundException {
        // 将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }
}
