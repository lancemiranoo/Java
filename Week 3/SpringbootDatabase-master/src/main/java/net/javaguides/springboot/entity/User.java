package net.javaguides.springboot.entity;

import jakarta.persistence.*;


//23 JPA PERSISTANCE // EXPLAIN THE ENTIRE USER ENTITY
@Entity// from jakarta persistence package
@Table(name = "users") // TO CONFIGURE THE TABLE NAME AS USER, IF YOU DONT PROVIDE IT THE NAME THE CLASS NAME
// TABLE WILL BE CREATED BY DEFAULT, WE ARE CUSTOMIZING THE TABLE NAME, WE CAN ALSO DEFINE THE SCHEMA RELATED
// DATABASE ATTRIBUTES HERE
public class User { // means this class is the JPA ENTITY

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    // No-argument constructor
    public User() {
    }

    // All-argument constructor
    public User(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
