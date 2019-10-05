package org.motometer.bot.telegram.api;

import org.motometer.telegram.bot.api.ImmutableOutboundMessage;
import org.motometer.telegram.bot.api.OutboundMessage;
import org.springframework.stereotype.Component;

@Component
public class OutboundMessageFactory {

    public OutboundMessage createMessage(int chatId) {
        return new ImmutableOutboundMessage.Builder()
            .chatId(chatId)
            .text("Your message was accepted")
            .build();
    }
}
