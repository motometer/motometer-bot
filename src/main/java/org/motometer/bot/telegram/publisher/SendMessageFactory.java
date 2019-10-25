package org.motometer.bot.telegram.publisher;

import org.motometer.telegram.bot.api.ImmutableSendMessage;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.SendMessage;

public class SendMessageFactory {

    public SendMessage createMessage(Message message) {
        return ImmutableSendMessage.builder()
            .chatId(message.chat().id())
            .replyToMessageId(message.id())
            .text("Ваше повідомлення прийнято, але на жаль я ще не готовий його опрацювати.")
            .build();
    }
}
