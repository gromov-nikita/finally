package servey.service;

import models.Org;
import models.Person;
import servey.interfaces.IStaffService;

import java.util.LinkedList;
import java.util.List;

public class StaffService implements IStaffService {
    @Override
    public LinkedList<Person> getByNameAndLastName(String name, String lastName, Org org) {
        List<Person> list = new LinkedList<>();
        for(Person x : org.getStaff()) {
            if(x.getName() == name && x.getLastName() == lastName) {
                list.add(x);
            }
        }
        return (LinkedList<Person>) list;
    }
    @Override
    public Person getByEmail(String email, Org org) {
        List<Person> list = new LinkedList<>();
        for(Person x : org.getStaff()) {
            if (x.getEmail().getAddress() == email) {
                return x;
            }
        }
        throw new IllegalArgumentException("Email not found");
    }
}
