package servey.service;
import helpers.Parser;
import models.Person;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

public class AccountCreater {
    public static String emailGen(Person p, List<Person> list) throws IOException {
        int number = 1;
        String domain = Parser.getProperty("src/main/resources/int.properties").getProperty("mail");
        String email = p.getName() + p.getLastName() + number + domain;
        cicle :
        for (Person x : list) {
            if (x.getEmail().getAddress().equals(email)) {
                number++;
                email = p.getName() + p.getLastName() + number + domain;
                continue cicle;
            }
        }
        return email;
    }
    public static String passwordGen() {
        return new BigInteger(50, new SecureRandom()).toString(32);
    }
}
