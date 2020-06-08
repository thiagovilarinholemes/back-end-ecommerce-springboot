package gd.rf.thiagolemes.coursejava.repositories;

import gd.rf.thiagolemes.coursejava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
