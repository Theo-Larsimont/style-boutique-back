package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

}