package com.marcosshirafuchi.workshopmongo.dto;

import com.marcosshirafuchi.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public AuthorDTO(){

    }

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }
}
