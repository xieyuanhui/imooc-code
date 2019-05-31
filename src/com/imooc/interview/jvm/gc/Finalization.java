package com.imooc.interview.jvm.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author LitheLight
 */
public class Finalization {

    public static Finalization finalization;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized");
        // 最后一次逃脱机会
        finalization = this;
    }

    public static void main(String[] args) {
        Finalization f = new Finalization();
        System.out.println("First print: " + f);
        f = null;
        System.gc();
        try {
            // 睡眠1s，让上面的垃圾回收线程执行完成
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second print: " + f);
        System.out.println(Finalization.finalization);

        // 强引用
        String str = new String("abc");
        ReferenceQueue queue = new ReferenceQueue();
        // 虚引用
        PhantomReference reference = new PhantomReference(str, queue);
        // 弱引用
        WeakReference<String> weakReference = new WeakReference<>(str);
        // 软引用
        SoftReference<String> softReference = new SoftReference<>(str);
    }
}
