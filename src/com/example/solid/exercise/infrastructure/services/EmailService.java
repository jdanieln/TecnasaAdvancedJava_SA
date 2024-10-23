package com.example.solid.exercise.services;

public class EmailService implements INotification {

	@Override
	public void send(String recipient, String message) {
		System.out.println("Sending email to " + recipient + ": " + message);
	}
}