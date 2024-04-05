package com.contacts.model;

import lombok.Data;

@Data
public class Email {
    private String label;
    private String email;

    public Email(String email, String label) {
        this.label = label;
        this.email = email;
    }

}
