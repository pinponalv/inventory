package com.pinpon.inventory.management.inventory.dto;

import com.pinpon.inventory.management.product.entity.Product;
import com.pinpon.inventory.management.warehouse.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseDTO {
    private Long id;
    private Product product;
    private Warehouse warehouse;
    private int stock;
}
