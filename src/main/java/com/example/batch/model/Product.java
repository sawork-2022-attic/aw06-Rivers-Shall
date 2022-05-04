package com.example.batch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String main_cat;

    private String title;

    private String asin;

    @ElementCollection
    private List<String> category;

    @ElementCollection
    private List<String> imageURLHighRes;
}
