package com.psp.TelegramBot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelegramBot1Application {

	public static void main(String[] args) {
		SpringApplication.run(TelegramBot1Application.class, args);

		TelegramBot telegramBot = new TelegramBot();
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(telegramBot);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
