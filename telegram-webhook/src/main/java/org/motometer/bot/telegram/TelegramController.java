package org.motometer.bot.telegram;

import org.motometer.bot.telegram.listener.UpdateListener;
import org.motometer.telegram.api.Update;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TelegramController {

    private final UpdateListener updateListener;

    @PostMapping("/message/${telegram.token}")
    public void update(@RequestBody Update update) {
        log.info("Received update id={}", update.getId());
        log.debug("Received update={}", update);
        updateListener.onUpdate(update);
    }
}
