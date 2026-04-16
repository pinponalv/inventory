package com.pinpon.inventory.management.inventoryMovement.mapper;

import com.pinpon.inventory.management.inventoryMovement.dto.ResponseMovementDTO;
import com.pinpon.inventory.management.inventoryMovement.entity.InventoryMovement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {ProductMapper.class, SupplierMapper.class,
        UserMapper.class, WarehouseMapper.class})
public interface InventoryMovementMapper {
    ResponseMovementDTO toDTO(InventoryMovement inventoryMovement);
}
