package org.motometer.bot.telegram;

import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TelegramController {

    @PostMapping("/message")
    public void onBotMessage(@RequestBody String payload) {
        log.info("Received message={}", payload);
    }
}
