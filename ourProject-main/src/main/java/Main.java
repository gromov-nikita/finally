import models.Person;
import models.Org;
import models.message.Message;
import servey.service.MessageService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Org org = new Org();
        Person p1 = new Person("1","1",org);
        Person p2 = new Person("1","1",org);
        new Person("1","1",org);
        new Person("2","2",org);
        Person p3 = new Person("2","2",org);
        new Person("2","2",org);
        new Person("2","2",org);
        List<Person> list = org.getStaff();
        for(Person x : list) {
            System.out.println(x);
        }
        MessageService messageService = new MessageService();
        messageService.sendMessage(new Message(p1.getEmail(),p2.getEmail(), "P1 -> P2 №1"));
        messageService.sendMessage(new Message(p1.getEmail(),p2.getEmail(), "P1 -> P2 №2"));
        messageService.sendMessage(new Message(p1.getEmail(),p2.getEmail(), "P1 -> P2 №3"));
        messageService.sendMessage(new Message(p1.getEmail(),p2.getEmail(), "P1 -> P2 №4"));
        messageService.sendMessage(new Message(p1.getEmail(),p2.getEmail(), "P1 -> P2 №5"));
        messageService.sendMessage(new Message(p1.getEmail(),p2.getEmail(), "P1 -> P2 №6"));
        messageService.sendMessage(new Message(p3.getEmail(),p1.getEmail(), "P3 -> P1 №1"));
        messageService.sendMessage(new Message(p3.getEmail(),p1.getEmail(), "P3 -> P1 №2"));
        messageService.sendMessage(new Message(p3.getEmail(),p1.getEmail(), "P3 -> P1 №3"));
        List<Message> list1 = p1.getEmail().getOutBox().getBox().get(p2.getEmail());
        for(Message x : list1) {
            System.out.println(x.getMessage());
        }
        System.out.println();
        List<Message> list2 = p3.getEmail().getOutBox().getBox().get(p1.getEmail());
        for(Message x : list2) {
            System.out.println(x.getMessage());
        }
        System.out.println();
        List<Message> list3 = p2.getEmail().getInBox().getBox().get(p1.getEmail());
        for(Message x : list3) {
            System.out.println(x.getMessage());
        }
        System.out.println();
        List<Message> list4 = p1.getEmail().getInBox().getBox().get(p3.getEmail());
        for(Message x : list4) {
            System.out.println(x.getMessage());
        }
        p1.getEmail().setNewPassword("12345",p1.getEmail().getPassword());
        System.out.println(p1);
        p1.getEmail().setNewPassword("12345","1321");
    }
}
