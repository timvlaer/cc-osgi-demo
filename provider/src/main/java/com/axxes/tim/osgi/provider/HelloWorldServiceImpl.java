package com.axxes.tim.osgi.provider;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void hello() {
        System.out.println("Hallo 2!");
    }
}
