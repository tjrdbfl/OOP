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

    public UserDTO(String username, String password, String passwordConfirm, String name, String ssn, String phoneNumber, String address, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + "\n" +
                ", password='" + password + "\n" +
                ", name='" + name + "\n" +
                ", ssn='" + ssn + "\n" +
                ", phoneNumber='" + phoneNumber + "\n" +
                ", address='" + address + "\n" +
                ", job='" + job + "\n" +
                '}';
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
