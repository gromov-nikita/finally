package models;

import models.message.box.Box;
import models.message.box.InBox;
import models.message.box.OutBox;
import servey.service.AccountCreater;

import java.io.IOException;
import java.util.List;

public class Email {
    private String address;
    private String password;
    private Box inBox;
    private Box outBox;
    private int limit;
    public Email(Person p,List<Person> list) throws IOException {
        address = AccountCreater.emailGen(p, list);
        password = AccountCreater.passwordGen();
        limit = 0;
        inBox = new InBox();
        outBox = new OutBox();
    }
    public int getLimit() {
        return limit;
    }
    public String getAddress() {
        return address;
    }
    public String getPassword() {
        return password;
    }
    public void limitAdd() {
        limit++;
    }
    public void updateLimit() {
        limit = 0;
    }
    public void setNewPassword(String newPassword, String oldPassword) {
        if(oldPassword == password) {
            this.password = newPassword;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    public Box getInBox() {
        return inBox;
    }
    public Box getOutBox() {
        return outBox;
    }
}
