package com.silviofranco.workshopmongo.resources;

import com.silviofranco.workshopmongo.DTO.UserDTO;
import com.silviofranco.workshopmongo.domain.User;
import com.silviofranco.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = service.findAll();
        List<UserDTO> listDto = list.stream().map(usuario -> new UserDTO(usuario)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}
