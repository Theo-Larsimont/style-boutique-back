package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "product_price", nullable = false)
    private Double price;

    @Column(name = "stock_quantity")
    private int quantity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private List<OrderItem> orderItems;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private List<ProductCategory> productCategories;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private List<ProductPicture> productPictures;

}
