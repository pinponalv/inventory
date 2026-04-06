package com.pinpon.inventory.management.purchaseOrder.mapper;

import com.pinpon.inventory.management.purchaseOrder.dto.product.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDTO(ProductMapper product);
}
