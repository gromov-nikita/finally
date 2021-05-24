package servey.service;

import models.Email;
import models.message.Message;
import servey.interfaces.IMessageService;

public class MessageService implements IMessageService {
    @Override
    public void sendMessage(Message message) {
        if(message.getFrom().getLimit() < 5) {
            message.getFrom().getOutBox().add(message);
            message.getTo().getInBox().add(message);
            message.getFrom().limitAdd();
        }
        else {
            System.out.println("The limit of sent messages for one email has been reached");
        }
    }
}
