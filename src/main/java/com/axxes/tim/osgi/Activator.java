package com.axxes.tim.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public Activator() {
        //default public constructor required so OSGi framework can initialize class via Activator.class.newInstance()
    }

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Hello world");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Goodbye World");
    }
}
