package com.contacts.model;

import java.util.ArrayList;
import java.util.List;
import com.contacts.model.Phone;

import lombok.Data;

@Data
public class Contact {

    private Long contactId;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<Phone> phones;
    private List<Email> emails;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.contactId = null;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        phones = new ArrayList<>();
        emails = new ArrayList<>();
    }

    public Contact() {
        this("", "", "", "");
    }

    public void addPhone(String phone, String label) {
        Phone p = new Phone(phone, label);
        phones.add(p);
    }

    public void addEmail(String email, String label) {
        Email e = new Email(email, label);
        emails.add(e);
    }

    @Override
    public String toString() {
        StringBuilder stringPhone = new StringBuilder();
        StringBuilder stringEmail = new StringBuilder();
        stringPhone.append("[");
        if (phones.size() > 0) {
            for (int i = 0; i < phones.size(); i++) {
                if (i < phones.size() - 1) {
                    stringPhone.append("{");
                    stringPhone.append("phone:" + phones.get(i).getPhone() + ", ");
                    stringPhone.append("label:" + phones.get(i).getLabel());
                    stringPhone.append("},");
                } else {
                    stringPhone.append("{");
                    stringPhone.append("phone:" + phones.get(i).getPhone() + ", ");
                    stringPhone.append("label:" + phones.get(i).getLabel());
                    stringPhone.append("}");
                }
            }
        }
        stringPhone.append("]");

        stringEmail.append("[");
        if (emails.size() > 0) {
            for (int i = 0; i < emails.size(); i++) {
                if (i < emails.size() - 1) {
                    stringEmail.append("{");
                    stringEmail.append("Email: " + emails.get(i).getEmail() + ", ");
                    stringEmail.append("label: " + emails.get(i).getLabel());
                    stringEmail.append("},");
                } else {
                    stringEmail.append("{");
                    stringEmail.append("Email: " + emails.get(i).getEmail() + ", ");
                    stringEmail.append("label: " + emails.get(i).getLabel());
                    stringEmail.append("}");
                }
            }
        }
        stringEmail.append("]");

        return String.format(
                "\t{ \"productId\":%d, \"firstName\":\"%s\", \"lastName\":\"%s\",   \"company\":\"%s\", \"jobTitle\":\"%s\", \"phones\":%s, \"emails\":%s} }",
                contactId, firstName, lastName, company, jobTitle, stringPhone, stringEmail);
    }

}
