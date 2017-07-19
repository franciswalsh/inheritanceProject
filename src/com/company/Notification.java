package com.company;

import java.time.LocalDateTime;

/**
 * Created by franciswalsh on 7/19/17.
 */
public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Status is up to date";

    public Notification(String subject, String body){
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public String getSubject(){
        return this.subject;
    }

    public String getBody(){
        return this.body;
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    public abstract void transport();

    public void showStatus(){
        System.out.println(this.status);
    }

    protected void notificationCreated(){
        System.out.println("Notification has been created");
    }
}
