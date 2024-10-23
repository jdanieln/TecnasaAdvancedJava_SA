package com.example.solid.exercise;

public class SMSService implements INotification{
	@Override
	public void send(String phoneNumber, String message) {
		System.out.println("Sending SMS to " + phoneNumber + ": " + message);
	}
}