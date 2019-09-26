package org.motometer.bot.telegram;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TelegramController implements UpdateListener {

    private final UpdateListener updateListener;

    @PostMapping("/message/${telegram.token}")
    public void onUpdate(@RequestBody Update update) {
        log.info("Received update id={}", update.getId());
        log.debug("Received update={}", update);
        updateListener.onUpdate(update);
    }
}
