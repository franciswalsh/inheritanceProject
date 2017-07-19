package com.company;

/**
 * Created by franciswalsh on 7/19/17.
 */
public class EmailNotification extends Notification {

    private String recipient;
    private String smptpProvider;

    public EmailNotification(String subject, String body, String recipient, String smptpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smptpProvider = smptpProvider;
    }

    public String getRecipient(){
        return this.recipient;
    }

    public String getSmptpProvider(){
        return this.smptpProvider;
    }

    @Override
    public void transport() {
        System.out.println("The subject is: " + super.getSubject());
        System.out.println("The body is: " + super.getBody());
        System.out.println("The notification was created at: " + super.getCreatedAt());
        System.out.println("The recipient of the notification is: " + this.getRecipient());
        System.out.println("The smptp Provider for the notification is: " + this.getSmptpProvider());
    }

    @Override
    public void notificationCreated(){
        super.notificationCreated();
        System.out.println("And that notification was an email");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (getRecipient() != null ? !getRecipient().equals(that.getRecipient()) : that.getRecipient() != null)
            return false;
        return getSmptpProvider() != null ? getSmptpProvider().equals(that.getSmptpProvider()) : that.getSmptpProvider() == null;
    }

    @Override
    public int hashCode() {
        int result = getRecipient() != null ? getRecipient().hashCode() : 0;
        result = 31 * result + (getSmptpProvider() != null ? getSmptpProvider().hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return new EmailNotification(super.getBody(), super.getSubject(), this.getRecipient(), this.getSmptpProvider());

    }
}


