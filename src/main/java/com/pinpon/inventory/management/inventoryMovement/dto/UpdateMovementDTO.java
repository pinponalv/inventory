package com.pinpon.inventory.management.inventoryMovement.dto;

import com.pinpon.inventory.management.inventoryMovement.entity.enums.TypeMovement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateMovementDTO {
    private Long productId;
    private Long warehouseId;
    private Long userId;
    private Long supplierId;
    private int quantity;
    private TypeMovement typeMovement;
}
