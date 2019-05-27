package com.imooc.interview.bytecode;

public class ByteCodeSample {

    public static void main(String[] args) {
        int i = 4;
        int j = 6;
        i++;
        --j;
        System.out.println(i);
        System.out.println(j);
        System.out.println("a".compareTo("b"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
