package gd.rf.thiagolemes.coursejava.repositories;

import gd.rf.thiagolemes.coursejava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
