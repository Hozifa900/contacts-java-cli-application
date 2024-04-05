package com.contacts.model;

import lombok.Data;

@Data
public class Phone {

    private String label;
    private String phone;

    public Phone(String phone, String label) {
        this.label = label;
        this.phone = phone;
    }

}
