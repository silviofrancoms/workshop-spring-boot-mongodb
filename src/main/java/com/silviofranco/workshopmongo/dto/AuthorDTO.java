package com.silviofranco.workshopmongo.dto;

import com.silviofranco.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getName();
    }
    public AuthorDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
