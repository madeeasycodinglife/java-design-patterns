package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton1 = " + singleton1);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2 = " + singleton2);
    }
}
