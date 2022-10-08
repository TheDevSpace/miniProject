package net.alterapp.miniproject3.service.impl;

import lombok.RequiredArgsConstructor;
import net.alterapp.miniproject3.domain.Contact;
import net.alterapp.miniproject3.repo.ContactRepo;
import net.alterapp.miniproject3.repo.MajorRepo;
import net.alterapp.miniproject3.repo.ProjectRepo;
import net.alterapp.miniproject3.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.*;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final MajorRepo majorRepo;
    private final ProfessorServiceImpl professorService;
    private final ProjectRepo projectRepo;
    private final ContactRepo contactRepo;

    @Override
    public Contact add(Contact contact) {
        return contactRepo.save(contact);
    }

    @Override
    public Contact addAddress(Contact contact) {
        Contact c = new Contact();
        c.setAddress(contact.getAddress());
        return contactRepo.save(contact);
    }

    @Override
    public Contact findById(Long id) {
        return contactRepo.findByIdAndDeletedAtIsNull(id);
    }
    @Override
    public Contact findByPhoneNumber(String phoneNumber) {
        return contactRepo.findByPhoneNumberAndDeletedAtIsNull(phoneNumber);
    }

    @Override
    public String updateAddress(long id, String address) {
        Contact contact = contactRepo.findByIdAndDeletedAtIsNull(id);
        contact.setAddress(address);
        contactRepo.save(contact);
        return "updated address";
    }

    @Override
    public String updateAll(long id, String address, String phoneNumber) {
        Contact contact = contactRepo.findByIdAndDeletedAtIsNull(id);
        contact.setAddress(address);
        contact.setPhoneNumber(phoneNumber);
        contactRepo.save(contact);
        return "updated all";
    }

    @Override
    public String delete(long id) {
        Date date = new Date();
        Contact contact = contactRepo.findByIdAndDeletedAtIsNull(id);
        contact.setDeletedAt(date);
        contactRepo.save(contact);
        return "deleted";
    }

    @Override
    public List<Contact> findAll() {
        return contactRepo.findAllByDeletedAtIsNull();
    }
}
