package com.imooc.interview.jvm.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * ReferenceQueueTest.class
 *
 * @author LitheLight
 * @date
 */
public class ReferenceQueueTest {

    private static ReferenceQueue<NormalObject> rq = new ReferenceQueue<>();

    private static void checkQueue() {
        Reference<NormalObject> ref = null;
        while ((ref = (Reference<NormalObject>)rq.poll()) != null) {
            if (ref != null) {
                System.out.println("In queue: " + ((NormalObjectWeakReference)(ref)).name);
                System.out.println("reference object: " + ref.get());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<WeakReference<NormalObject>> weakList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            weakList.add(new NormalObjectWeakReference(new NormalObject("weak " + i), rq));
            System.out.println("Create weak: " + weakList.get(i));
        }
        System.out.println("first time ");
        checkQueue();
        System.gc();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("second time ");
        checkQueue();
    }
}
