package models.message;

import models.Email;

public class Message {
    private Email from;
    private Email to;
    private String message;
    public Message(Email from, Email to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }
    public Email getFrom() {
        return from;
    }
    public Email getTo() {
        return to;
    }
    public String getMessage() {
        return message;
    }
}
