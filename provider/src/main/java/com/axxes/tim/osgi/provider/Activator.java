package com.axxes.tim.osgi.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

    private ServiceRegistration registration;

    public Activator() {
        //default public constructor required so OSGi framework can initialize class via Activator.class.newInstance()
    }

    @Override
    public void start(BundleContext bundleContext)  {
        System.out.println("Start provider");

        registration = bundleContext.registerService(HelloWorldService.class.getName(),
                new HelloWorldServiceImpl(),
                null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stop provider");
        registration.unregister();

    }
}
