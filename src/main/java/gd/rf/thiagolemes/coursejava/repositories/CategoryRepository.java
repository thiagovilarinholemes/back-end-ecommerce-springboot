package gd.rf.thiagolemes.coursejava.repositories;

import gd.rf.thiagolemes.coursejava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
