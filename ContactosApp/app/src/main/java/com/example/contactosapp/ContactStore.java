package com.example.contactosapp;

import java.util.ArrayList;
import java.util.List;

public class ContactStore {
    List<Contact> cache = new ArrayList<>();

    public ContactStore() {
        this.cache = ContactStore.createContacts();
    }

    public List<Contact> getCache() {
        return cache;
    }

    public Contact get(int position) {
        return cache.get(position);
    }

    public int size() {
        return cache.size();
    }

    public Contact findContactByPhone(String phoneNumber) {
        for (Contact c: cache) {
            if (c.phone.equals(phoneNumber)) {
                return c;
            }
        }
        return null;
    }

    public static List<Contact> createContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ariana Grande", "1553853365"));
        contacts.add(new Contact("Kenia Os", "1553853365"));
        contacts.add(new Contact("Cornejo Cornejo", "1553853365"));
        return contacts;
    }
}
