package org.motometer.bot.telegram.subscriber;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;

import java.util.concurrent.ExecutorService;

@RequiredArgsConstructor
public class AsyncUpdateListener implements UpdateListener {

    private final ExecutorService executorService;
    private final UpdateListener updateListener;

    @Override
    public void onUpdate(Update update) {
        executorService.execute(() -> {
            updateListener.onUpdate(update);
        });
    }
}
