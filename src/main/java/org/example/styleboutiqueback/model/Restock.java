package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "restock")
public class Restock {
    @Id
    @GeneratedValue
    @Column(name = "restock_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "restock_date", nullable = false)
    private LocalDate restockDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
    private List<Restock> restocks;
}