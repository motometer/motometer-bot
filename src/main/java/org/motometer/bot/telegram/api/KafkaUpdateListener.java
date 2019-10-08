package org.motometer.bot.telegram.api;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
public class KafkaUpdateListener implements UpdateListener {

    private final KafkaTemplate<String, Update> kafkaTemplate;
    private final String updateTopic;

    @Override
    public void onUpdate(Update update) {
        kafkaTemplate.send(updateTopic, update);
    }
}
