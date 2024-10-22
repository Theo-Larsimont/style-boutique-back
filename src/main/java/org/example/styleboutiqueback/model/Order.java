package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<OrderItem> orderItems;

/*
 TODO [Reverse Engineering] create field to map the 'status' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'in_process'")
    @Column(name = "status", columnDefinition = "order_status not null")
    private Object status;
*/
}