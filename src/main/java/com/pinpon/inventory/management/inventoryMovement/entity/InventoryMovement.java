package com.pinpon.inventory.management.inventoryMovement.entity;

import com.pinpon.inventory.management.inventoryMovement.entity.enums.TypeMovement;
import com.pinpon.inventory.management.product.entity.Product;
import com.pinpon.inventory.management.user.entity.User;
import com.pinpon.inventory.management.warehouse.entity.Warehouse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "movements")
public class InventoryMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;
    private Warehouse warehouse;
    private User user;
    private int quantity;
    private Date creationDate;
    private TypeMovement typeMovement;
}
