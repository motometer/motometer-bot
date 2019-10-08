package org.motometer.bot.telegram.publisher;

import org.motometer.telegram.bot.api.method.ImmutableSendMessage;
import org.motometer.telegram.bot.api.method.SendMessage;
import org.springframework.stereotype.Component;

@Component
public class SendMessageFactory {

    public SendMessage createMessage(int chatId) {
        return new ImmutableSendMessage.Builder()
            .chatId(chatId)
            .text("Thanks for your message. The team is working hard to deliver me as soon as possible. I will DM you once I'm ready.")
            .build();
    }
}
