package com.example.case_modelu4_be.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_shop")
    private Shop shop;

}
