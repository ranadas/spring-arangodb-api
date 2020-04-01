package com.arzamed.graph.model;

import com.arangodb.springframework.annotation.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("characters")
public class Character {
    @Id
    private String id;
    private String name;
    private String surname;
    private boolean alive;
    private Integer age;

    public Character(String name, String surname, boolean alive, Integer age) {
        super();
        this.name = name;
        this.surname = surname;
        this.alive = alive;
        this.age = age;
    }
}
