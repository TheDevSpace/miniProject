package net.alterapp.miniproject3.controller;

import net.alterapp.miniproject3.domain.Customer;
import net.alterapp.miniproject3.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;


@Service
@RestController
@RequestMapping("/api/customer")
public class CustumerController extends BaseController{
    private final CustomerService customerService;

    public CustumerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> getAll() {
        return buildResponse(customerService.findAll(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> getById(@RequestParam Long id) {
        return buildResponse(customerService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Customer customer) {
        return buildResponse(customerService.add(customer), HttpStatus.OK);
    }

    @Scheduled(cron = "0 0 */2 * * ?", zone="Asia/Almaty") //Every 2 hours
    private void proverka(){
        System.out.println("Работает отлично");
    }

}