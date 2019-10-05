package org.motometer.bot.telegram.api;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.Bot;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessagePublisher {

    private final Bot bot;
    private final OutboundMessageFactory outboundMessageFactory;

    @KafkaListener(topics = "${telegram.output.topic}", groupId = "1")
    public void onMessage(int chatId) {
        bot.sendMessage(outboundMessageFactory.createMessage(chatId));
    }
}
