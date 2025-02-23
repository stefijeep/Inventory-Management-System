package org.example.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private Double price;

    private int quantity;

    private String description;

    @Column(name = "created_at")
    private LocalDateTime updetedAt;





}
