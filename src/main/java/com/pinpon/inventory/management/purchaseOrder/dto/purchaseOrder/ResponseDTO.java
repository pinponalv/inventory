package com.pinpon.inventory.management.purchaseOrder.dto.purchaseOrder;

import com.pinpon.inventory.management.purchaseOrder.dto.product.ProductDTO;
import com.pinpon.inventory.management.purchaseOrder.dto.supplier.SupplierDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseDTO {
    private Long id;
    private ProductDTO product;
    private SupplierDTO supplier;
    private int stock;
    private BigDecimal purchasePrice;
}
