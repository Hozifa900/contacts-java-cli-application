package com.contacts;

import java.util.*;

import com.contacts.model.Contact;
import com.contacts.model.Email;
import com.contacts.model.Phone;
import com.contacts.model.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Contact();
        contacts.add(contact1);
        Contact contact2 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        contact2.addPhone("240-133-0011", "Home");
        contact2.addPhone("240-112-0123", "Mobile");
        contact2.addEmail("dave.sang@gmail.com", "Home");
        contact2.addEmail("dsanger@argos.com", "Work");
        contacts.add(contact2);
        Contact contact3 = new Contact("Carlos", "Jimenez", "Zappos", "Director");
        contacts.add(contact3);
        Contact contact4 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        contact4.addPhone("412-116-9988", "Work");
        contact4.addEmail("ali@bmi.com", "Work");

        User user = new User(contacts);

        user.printContacts();

    }
}
