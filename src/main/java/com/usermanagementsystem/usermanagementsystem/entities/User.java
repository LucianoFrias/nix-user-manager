package com.usermanagementsystem.usermanagementsystem.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String surname;
    private String gender;
    private String password;
    private String role;

    private String email;


    public User(String name, String surname, String gender, String password, String role, String email) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public User(Long id, String name, String surname, String gender, String password, String role, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public User(){}
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
