package models.message.box;

import models.Email;

import models.Person;
import models.message.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Box {
    Map<Email, List<Message>> box;
    public Box() {
        box = new HashMap<>();
    }
    public void clear() {
        box = new HashMap<>();
    }
    public void clear(Email p) {
        box.remove(p);
    }
    public Map<Email, List<Message>> getBox() {
        return box;
    }
    public abstract void add(Message message);
}
