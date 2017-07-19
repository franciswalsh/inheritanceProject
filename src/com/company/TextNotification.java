package com.company;

/**
 * Created by franciswalsh on 7/19/17.
 */
public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider){
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.status = "status is not up to date";
        this.notificationCreated();
    }

    public String getRecipient(){
        return this.recipient;
    }

    public String getSmsProvider(){
        return this.smsProvider;
    }
    @Override
    public void transport() {
        System.out.println("The subject is: " + super.getSubject());
        System.out.println("The body is: " + super.getBody());
        System.out.println("The notification was created at: " + super.getCreatedAt());
        System.out.println("The recipient of the notification is: " + this.getRecipient());
        System.out.println("The sms Provider for the notification is: " + this.getSmsProvider());
    }
}
