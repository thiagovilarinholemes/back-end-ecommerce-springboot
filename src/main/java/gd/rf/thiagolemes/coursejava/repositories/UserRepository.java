package gd.rf.thiagolemes.coursejava.repositories;

import gd.rf.thiagolemes.coursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
