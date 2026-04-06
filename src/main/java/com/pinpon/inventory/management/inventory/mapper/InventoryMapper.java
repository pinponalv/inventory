package com.pinpon.inventory.management.inventory.mapper;

import com.pinpon.inventory.management.inventory.dto.ResponseInventoryDTO;
import com.pinpon.inventory.management.inventory.entity.Inventory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryMapper {
    ResponseInventoryDTO toDTO(Inventory inventory);
}
