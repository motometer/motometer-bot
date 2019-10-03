package org.motometer.bot.telegram.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RequiredArgsConstructor
public class KafkaTestListener {

    private final CompletableFuture<String> result;

    @KafkaListener(topics = "telegram-bot", groupId = "telegram")
    public void listen(String message) {
        log.debug("Receive message={}", message);
        result.complete(message);
    }
}
