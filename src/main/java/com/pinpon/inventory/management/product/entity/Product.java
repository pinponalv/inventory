package com.pinpon.inventory.management.product.entity;

import com.pinpon.inventory.management.inventory.entity.Inventory;
import com.pinpon.inventory.management.inventoryMovement.entity.InventoryMovement;
import com.pinpon.inventory.management.purchaseOrder.entity.PurchaseOrder;
import com.pinpon.inventory.management.supplier.entity.Supplier;
import com.pinpon.inventory.management.warehouse.entity.Warehouse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @OneToMany (mappedBy = "product")
    private List<Inventory> inventory;

    @OneToMany (mappedBy = "products")
    private List<PurchaseOrder> purchaseOrder;

    @OneToMany (mappedBy = "productss")
    private List<InventoryMovement> inventoryMovements;

}
