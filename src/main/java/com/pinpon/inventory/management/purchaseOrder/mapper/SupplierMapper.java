package com.pinpon.inventory.management.purchaseOrder.mapper;

import com.pinpon.inventory.management.purchaseOrder.dto.supplier.SupplierDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    SupplierDTO toDTO(SupplierMapper supplier);
}
