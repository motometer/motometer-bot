package org.motometer.bot.telegram.publisher;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SendMessageFactoryTest {

    @Test
    void createMessage() {
        var factory = new SendMessageFactory();
        var chatId = 321;

        var message = factory.createMessage(chatId);

        assertThat(message).isNotNull();
        assertThat(message.chatId()).isEqualTo(chatId);
        assertThat(message.text()).isEqualTo("Thanks for your message. The team is working hard to deliver me as soon as possible. I will DM you once I'm ready.");
    }
}