package models.message.box;
import models.message.Message;
import java.util.LinkedList;
public class InBox extends Box{
    @Override
    public void add(Message message) {
        if(!getBox().containsKey(message.getFrom())) {
            getBox().put(message.getFrom(), new LinkedList<>());
        }
        getBox().get(message.getFrom()).add(message);
    }
}
