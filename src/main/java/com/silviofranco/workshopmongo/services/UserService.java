package com.silviofranco.workshopmongo.services;

import com.silviofranco.workshopmongo.DTO.UserDTO;
import com.silviofranco.workshopmongo.domain.User;
import com.silviofranco.workshopmongo.repository.UserRepository;
import com.silviofranco.workshopmongo.services.exception.ObjectNotFoundException;
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
       return user.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado! id: "+id));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
