package com.company;

public class Main {

    static {
        System.loadLibrary("hello"); // Load native library at runtime
    }

    private native void sayHello();

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        long being = System.nanoTime();
        m.sayHello();
        System.out.println(System.nanoTime() - being);
    }
}
