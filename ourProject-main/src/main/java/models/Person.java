package models;
import java.io.IOException;
public class Person {
    private String name;
    private String lastName;
    private Email email;
    public Person(String name, String lastName, Org org) throws IOException {
        this.name = name;
        this.lastName = lastName;
        email = new Email(this, org.getStaff());
        org.add(this);
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public Email getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Person: \n" +
                "  name: " + name + '\n' +
                "  lastName: " + lastName + '\n' +
                "  email: " + email.getAddress() + '\n' +
                "  password: " + email.getPassword() + "\n";
    }
}
