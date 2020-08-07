package net.alterapp.miniproject3.service;

import net.alterapp.miniproject3.domain.Book;
import net.alterapp.miniproject3.domain.Customer;
import net.alterapp.miniproject3.domain.Library;
import net.alterapp.miniproject3.domain.Order;
import net.alterapp.miniproject3.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> findAll() {
        return customerRepo.findAllByDeletedAtIsNull();
    }

    public Customer findById(Long id){
        return customerRepo.findByIdAndDeletedAtIsNull(id);
    }

    public Customer add(Customer customer) {
        return customerRepo.save(customer);
    }



}
