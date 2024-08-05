package com.example.solid.principles.dip;

import com.example.solid.principles.dip.after.EmailService;
import com.example.solid.principles.dip.after.NotificationManager;
import com.example.solid.principles.dip.after.NotificationService;
import com.example.solid.principles.dip.after.SMSService;

public class Dip {
    public void run() {
        NotificationService emailService = new EmailService();
        NotificationService smsService = new SMSService();
        NotificationManager manager = new NotificationManager(emailService, smsService);

        manager.sendEmailNotification("user@example.com", "Hello via email!");
        manager.sendSMSNotification("123-456-7890", "Hello via SMS!");
    }
}
