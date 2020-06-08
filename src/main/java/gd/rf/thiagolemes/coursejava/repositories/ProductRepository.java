package gd.rf.thiagolemes.coursejava.repositories;

import gd.rf.thiagolemes.coursejava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
