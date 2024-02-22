package model;

import java.util.PrimitiveIterator;

public class UserDTO {
    private String username;
    private String password;
    private String passwordConfirm;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;

    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public UserDTO(String id, String pw, String pwAgain
            , String name, String personId, String phoneNumber
            , String address, String job, double height, double weight) {
        this.username = id;
        this.password = pw;
        this.passwordConfirm = pwAgain;
        this.name = name;
        this.ssn = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height=height;
        this.weight=weight;

    }

    public String toString() {
        return "Member{" +
                "id='" + username + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
