package com.pinpon.inventory.management.inventoryMovement.entity;

import com.pinpon.inventory.management.inventoryMovement.entity.enums.TypeMovement;
import com.pinpon.inventory.management.product.entity.Product;
import com.pinpon.inventory.management.supplier.entity.Supplier;
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
    @JoinColumn(name = "product_id")
    private Product productss;

    @ManyToOne
    @JoinColumn(name = "almacen_id")
    private Warehouse warehouse;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Supplier supplier;
    private int quantity;
    private Date creationDate;
    private TypeMovement typeMovement;


}
