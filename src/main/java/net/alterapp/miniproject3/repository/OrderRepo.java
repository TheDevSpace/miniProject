package net.alterapp.miniproject3.repository;


import net.alterapp.miniproject3.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findAllByDeletedAtIsNull();
    Order findByIdAndDeletedAtIsNull(Long id);
}
