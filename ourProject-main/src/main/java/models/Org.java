package models;
import servey.service.AccountCreater;

import java.util.LinkedList;
import java.util.List;
public class Org {
    private List<Person> staff;
    public Org() {
        staff = new LinkedList<>();
    }
    public void remove(Person p) {
        staff.remove(p);
    }
    public void add(Person person) {
        staff.add(person);
    }
    public List<Person> getStaff() {
        return staff; }
}
