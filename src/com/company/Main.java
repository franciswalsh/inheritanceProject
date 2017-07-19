package com.company;

import javax.xml.soap.Text;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmailNotification firstEmail = new EmailNotification("Rent Due",
                "Your rent is late!", "tenant", "provider 1");

        TextNotification firstText = new TextNotification("Hey",
                "Hey man, what's up?", "Your friend", "AT&T");

        firstEmail.transport();

        firstText.transport();

        firstEmail.showStatus();

        firstText.showStatus();

        firstEmail.notificationCreated();


        try {
            Object emailNotificationClone = firstEmail.clone();
            if (firstEmail.equals(emailNotificationClone)){
                System.out.println("The clone and the original are equal");
            }
            else {
                System.out.println("The clone and the original are not equal");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
}
