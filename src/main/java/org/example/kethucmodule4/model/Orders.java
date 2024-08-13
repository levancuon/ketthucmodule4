package org.example.kethucmodule4.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime BuyDay;
    private Long quantity;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Products products;

}
