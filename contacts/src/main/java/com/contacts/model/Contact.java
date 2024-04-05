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
        Phone e = new Phone(email, label);
        phones.add(e);
    }

    @Override
    public String toString() {
        return String.format(
                "\t{ \"productId\":%d, \"firstName\":\"%s\", \"lastName\":\"%s\",   \"company\":%s\", \"jobTitle\":%s\" }",
                contactId, firstName, lastName, company, jobTitle);
    }

    // @Override
    // public String toString() {
    // return String.format("\t{ \"contactId\":%d, \"firstName\":\"%s\",
    // \"lastName\":\"%s\",
    // \"company\":\"%s\", \"jobTitle\":\"%s\" }",
    // contactId, firstName, lastName, company, jobTitle);
    // }

    // {\"firstName\":\"%s\",\"firstName\":\"%s\",}

    // @Override
    // public String toString() {
    // final StringBuilder sb = new StringBuilder("Product{");
    // sb.append("productId=").append(productId);
    // sb.append(", name='").append(name).append('\'');
    // sb.append(", dateSupplied=").append(dateSupplied);
    // sb.append(", quantityInStock=").append(quantityInStock);
    // sb.append(", unitPrice=").append(unitPrice);
    // sb.append('}');
    // return sb.toString();
    // }

    // public String toJSONString() {
    // return String.format("\t{ \"productId\":%d, \"name\":\"%s\",
    // \"dateSupplied\":\"%s\", \"quantityInStock\":%d, \"unitPrice\":%,.2f }",
    // productId, name, dateSupplied, quantityInStock, unitPrice);
    // }

    // public String toXMLString() {
    // return String.format("\t<product productId=\"%d\" name=\"%s\"
    // dateSupplied=\"%s\" quantityInStock=\"%d\" unitPrice=\"%,.2f\" />",
    // productId, name, dateSupplied, quantityInStock, unitPrice);
    // }

    // public String toCSVString() {
    // return String.format("%d, %s, %s, %d, %.2f",
    // productId, name, dateSupplied, quantityInStock, unitPrice);
    // }

}
