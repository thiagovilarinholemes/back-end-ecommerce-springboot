package gd.rf.thiagolemes.coursejava.services;

import gd.rf.thiagolemes.coursejava.entities.User;
import gd.rf.thiagolemes.coursejava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    // Retorna o usuário salvo
    public User insert(User obj){
        return repository.save(obj);
    }
}
