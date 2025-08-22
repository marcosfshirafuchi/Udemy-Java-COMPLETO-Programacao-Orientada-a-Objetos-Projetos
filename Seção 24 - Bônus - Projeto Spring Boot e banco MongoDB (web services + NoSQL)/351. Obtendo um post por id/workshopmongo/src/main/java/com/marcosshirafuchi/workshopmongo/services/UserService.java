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

    public User update(User obj){
        User newObj = repo.findById(obj.getId())
                .orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado com id: " + obj.getId()));
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
