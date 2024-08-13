package org.example.kethucmodule4.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private Double Price;
    private String status;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories categories;

}
