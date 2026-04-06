package com.pinpon.inventory.management.purchaseOrder.mapper;

import com.pinpon.inventory.management.purchaseOrder.dto.purchaseOrder.ResponseDTO;
import com.pinpon.inventory.management.purchaseOrder.entity.PurchaseOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = {ProductMapper.class, SupplierMapper.class})
public interface PurchaseOrderMapper {
    @Mapping(source = "stock", target = "stock")
    @Mapping(source = "purchasePrice", target = "purchasePrice")
    ResponseDTO toDTO(PurchaseOrder purchaseOrder);
}
