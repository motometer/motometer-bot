package org.motometer.bot.telegram.api;

import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.OutboundMessage;

import static org.assertj.core.api.Assertions.assertThat;

class OutboundMessageFactoryTest {

    @Test
    void createMessage() {
        OutboundMessageFactory factory = new OutboundMessageFactory();

        int chatId = 321;

        OutboundMessage message = factory.createMessage(chatId);

        assertThat(message).isNotNull();
        assertThat(message.chatId()).isEqualTo(chatId);
        assertThat(message.text()).isEqualTo("Your message was accepted");
    }
}