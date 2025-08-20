package com.marcosshirafuchi.workshopmongo.services;

import com.marcosshirafuchi.workshopmongo.domain.User;
import com.marcosshirafuchi.workshopmongo.dto.UserDTO;
import com.marcosshirafuchi.workshopmongo.repository.UserRepository;
import com.marcosshirafuchi.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);
        if(user.isEmpty()){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user.orElse(null);
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        User byId = findById(id);
        repo.delete(byId);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
