package org.motometer.bot.telegram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.motometer.bot.telegram.TelegramSubscriberApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TelegramSubscriberApplication.class)
class TelegramSubscriberApplicationTest {

    @Test
    void contextLoads() {

    }
}
