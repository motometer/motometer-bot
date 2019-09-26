package org.motometer.bot.telegram.listener;

import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.springframework.stereotype.Component;

@Component
public class NoOpUpdateListener implements UpdateListener {

    @Override
    public void onUpdate(Update update) {

    }
}
