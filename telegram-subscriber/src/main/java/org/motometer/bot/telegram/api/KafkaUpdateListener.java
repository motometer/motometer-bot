package org.motometer.bot.telegram.api;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaUpdateListener implements UpdateListener {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void onUpdate(Update update) {
        kafkaTemplate.send("telegram-bot", update.toString());
    }
}
