package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product_pictures")
public class ProductPicture {
    @Id
    @GeneratedValue
    @Column(name = "picture_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "picture_url", nullable = false, length = Integer.MAX_VALUE)
    private String pictureUrl;

}