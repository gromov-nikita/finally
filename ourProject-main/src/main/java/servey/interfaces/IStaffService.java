package servey.interfaces;

import models.Org;
import models.Person;

import java.util.LinkedList;
import java.util.List;

public interface IStaffService {
    LinkedList<Person> getByNameAndLastName(String name, String lastName, Org org);
    Person getByEmail(String email, Org org);
}
