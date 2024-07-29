package com.nath.sma.service;


import com.nath.sma.entity.Contact;

public interface ContactService {

    Contact saveContact(Contact contact);

    Iterable<Contact> ShowContact();

    Contact getContactById(long id);

    void deleteContact(Contact contact);
}