package com.contacts.model;

import java.util.Comparator;
import java.util.List;

import lombok.Data;

@Data
public class User {
    private Long userId;
    private List<Contact> contacts;

    public User(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void printContacts() {
        System.out.println("<------------ List of the Contacts ------------->");
        System.out.println("[");

        contacts.stream().sorted(Comparator.comparing(Contact::getLastName)).forEach(System.out::println);
        System.out.println("]");
    }

}
