package org.motometer.bot.telegram.publisher;

import org.motometer.telegram.bot.Bot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BotConfig {

    @Bean
    public Bot bot(@Value("${telegram.token}") String token, @Value("${telegram.api}") String api) {
        return Bot.builder()
            .token(token)
            .apiHost(api)
            .build();
    }
}
