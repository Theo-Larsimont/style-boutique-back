package org.example.styleboutiqueback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Order> orders;
}
