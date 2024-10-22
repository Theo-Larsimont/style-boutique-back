package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product_categories")
public class ProductCategory {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

}