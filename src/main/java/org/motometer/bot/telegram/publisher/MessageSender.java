package org.motometer.bot.telegram.publisher;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageSender implements UpdateListener {

    private final Bot bot;
    private final SendMessageFactory sendMessageFactory;

    @Override
    public void onUpdate(Update update) {
        var message = sendMessageFactory.createMessage(update.message().chat().id());
        bot.sendMessage(message);
    }
}
