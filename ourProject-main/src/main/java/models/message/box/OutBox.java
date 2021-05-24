package models.message.box;

import models.message.Message;

import java.util.LinkedList;

public class OutBox extends Box {
    @Override
    public void add(Message message) {
        if(!getBox().containsKey(message.getTo())) {
            getBox().put(message.getTo(), new LinkedList<>());
        }
        getBox().get(message.getTo()).add(message);
    }
}
