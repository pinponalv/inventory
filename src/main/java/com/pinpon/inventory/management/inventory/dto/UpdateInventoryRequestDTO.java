package com.pinpon.inventory.management.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateInventoryRequestDTO {
    private Long productId;
    private Long warehouseId;
    private int stock;
}
