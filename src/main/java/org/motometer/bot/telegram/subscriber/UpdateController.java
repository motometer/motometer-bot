package org.motometer.bot.telegram.subscriber;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UpdateController implements UpdateListener {

    private final AsyncUpdateListener updateListener;

    @Override
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/bot/update/${telegram.token}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void onUpdate(@RequestBody Update update) {
        log.info("Received update");
        log.debug("Received update={}", update);
        updateListener.onUpdate(update);
    }
}
