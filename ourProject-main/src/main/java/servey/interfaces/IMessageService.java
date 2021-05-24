package servey.interfaces;

import models.Email;
import models.message.Message;

public interface IMessageService {
    void sendMessage(Message message);
}
