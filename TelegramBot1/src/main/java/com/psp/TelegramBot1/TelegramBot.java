package com.psp.TelegramBot1;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {

    private final String botUsername;

    public TelegramBot() {
        super("");
        this.botUsername = "PspTelegramBot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
            long chat_id = update.getMessage().getChatId();
            String username = update.getMessage().getChat().getUserName();
            String message_received = update.getMessage().getText();
            String messageText = "Has dicho: " + message_received;
            SendMessage message = SendMessage.builder()
                    .chatId(chat_id)
                    .text(messageText)
                    .build();
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return this.botUsername;
    }
}
