package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name", nullable = false)
    private Integer categoryName;

}