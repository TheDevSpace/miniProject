package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Contact;

import java.util.List;

public interface ContactService {
    Contact add(Contact contact);

    Contact addAddress(Contact contact);

    Contact findById(Long id);

    Contact findByPhoneNumber(String phoneNumber);

    String updateAddress(long id, String address);

    String updateAll(long id, String address, String phoneNumber);

    String delete(long id);

    List<Contact> findAll();
}
