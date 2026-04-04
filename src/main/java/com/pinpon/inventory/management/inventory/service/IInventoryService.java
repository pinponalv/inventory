package com.pinpon.inventory.management.inventory.service;

import com.pinpon.inventory.management.inventory.dto.CreateInventoryRequestDTO;
import com.pinpon.inventory.management.inventory.dto.ResponseDTO;
import com.pinpon.inventory.management.inventory.dto.UpdateInventoryRequestDTO;

import java.util.List;

public interface IInventoryService {
    ResponseDTO createInventory(CreateInventoryRequestDTO requestDTO);
    List<ResponseDTO> getAllInvetory();
    ResponseDTO findInventoryById(Long id);
    ResponseDTO updateInventory(Long id, UpdateInventoryRequestDTO requestDTO);
    void deleteInventory(Long id);
}
