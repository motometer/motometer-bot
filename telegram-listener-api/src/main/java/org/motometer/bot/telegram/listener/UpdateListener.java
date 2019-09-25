package org.motometer.bot.telegram.listener;

import org.motometer.telegram.api.Update;

public interface UpdateListener {

    void onUpdate(Update update);
}
