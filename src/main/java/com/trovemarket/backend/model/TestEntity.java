package com.trovemarket.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestEntity {
    @Id
    private Long id;
    private String name;

    // getters and setters
}
