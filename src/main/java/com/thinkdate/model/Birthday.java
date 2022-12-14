package com.thinkdate.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Birthday {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private LocalDate date;

    public Birthday() {
        super();
    }

    public Birthday(String firstname, String lastname, User user, LocalDate date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.user = user;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public User getUser() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", user=" + user.getLastname() +
                ", date=" + date +
                '}';
    }
}
