package net.alterapp.miniproject3.controller;

import net.alterapp.miniproject3.domain.Library;
import net.alterapp.miniproject3.domain.Order;
import net.alterapp.miniproject3.exception.ServiceException;
import net.alterapp.miniproject3.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/order")
public class OrderController extends BaseController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> getAll() {
        return buildResponse(orderService.findAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findById(Long id) {
        return buildResponse(orderService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Order order) throws ServiceException {
        return buildResponse(orderService.add(order), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateOrder(@RequestParam Long id) {
        return buildResponse(orderService.update(id), HttpStatus.OK);
    }

    @PutMapping("/updateDate")
    public ResponseEntity<?> updatePassingDate(@RequestParam Long id) {
        return buildResponse(orderService.updatePassedDate(id), HttpStatus.OK);
    }

}
