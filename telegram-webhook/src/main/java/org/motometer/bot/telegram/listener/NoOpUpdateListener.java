package org.motometer.bot.telegram.listener;

import org.motometer.telegram.api.Update;
import org.springframework.stereotype.Component;

@Component
public class NoOpUpdateListener implements UpdateListener {

    @Override
    public void onUpdate(final Update update) {

    }
}
