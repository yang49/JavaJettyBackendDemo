package com.myProject.system;

/**
 * Created by yang on 19/12/16.
 */
public class MySystem {

    public static MySystem system;

    public MySystem() {
        // constructor
    }

    public static void init() {
        system = new MySystem();
        system.initSystem();
    }

    public void initSystem() {
        System.out.println("System starting...");
    }
}
