package com.silviofranco.workshopmongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document(collation ="user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;


}
