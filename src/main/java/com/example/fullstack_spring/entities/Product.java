package com.example.fullstack_spring.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter @Setter
@Document(collection = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    public String id;
    public String name;
    public String description;
    public Long price;

}
