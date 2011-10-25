package com.microsoft.azure.services.serviceBus;


public interface MessageSender {
	void sendMessage(Message message);
	void sendMessage(Message message, SendMessageOptions options);
}
