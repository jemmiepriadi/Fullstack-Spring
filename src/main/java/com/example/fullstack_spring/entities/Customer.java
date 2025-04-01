package com.example.fullstack_spring.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@Document(collection = "customers")
public class Customer {
    private static final long serialVersionUID = 1L;
    @Id
    public long id;
    public String name;
}
