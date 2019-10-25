package org.motometer.bot.telegram.publisher;

import org.motometer.bot.telegram.subscriber.AsyncUpdateListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class Config {

    @Bean
    public AsyncUpdateListener asyncUpdater(MessageSender messageSender) {
        return new AsyncUpdateListener(newThreadPool(), messageSender);
    }

    private ExecutorService newThreadPool() {
        return Executors.newCachedThreadPool();
    }
}
