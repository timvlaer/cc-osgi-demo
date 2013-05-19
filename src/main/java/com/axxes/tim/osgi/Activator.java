package com.axxes.tim.osgi;

/**
 * Created with IntelliJ IDEA.
 * User: Tim
 * Date: 19/05/13
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
public class Activator implements BundleActivator {
    public void start(BundleContext context) throws Exception {
        System.out.println("Hello world");
    }
    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye World");
    }
}
