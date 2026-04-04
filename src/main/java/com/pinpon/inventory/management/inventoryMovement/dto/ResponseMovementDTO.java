package com.pinpon.inventory.management.inventoryMovement.dto;

import com.pinpon.inventory.management.product.entity.Product;
import com.pinpon.inventory.management.user.entity.User;
import com.pinpon.inventory.management.warehouse.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseMovementDTO {
    private Product product;
    private Warehouse warehouse;
    private User user;
    private int quantity;
    private Date creationDate;
}
