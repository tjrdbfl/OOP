package model;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

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


}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
