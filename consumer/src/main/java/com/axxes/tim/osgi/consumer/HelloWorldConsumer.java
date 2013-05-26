package com.axxes.tim.osgi.consumer;

import com.axxes.tim.osgi.provider.HelloWorldService;

import java.util.Timer;
import java.util.TimerTask;

public class HelloWorldConsumer {
    private final HelloWorldService service;
    private final Timer timer;

    public HelloWorldConsumer(HelloWorldService service) {
        super();

        this.service = service;

        timer = new Timer();
        timer.schedule(new ServiceTimerTask(service), 2500);
    }

    private static class ServiceTimerTask extends TimerTask {

        private final HelloWorldService service;

        public ServiceTimerTask(HelloWorldService service) {
            this.service = service;
        }

        @Override
        public void run() {
            service.hello();
        }
    }
}
