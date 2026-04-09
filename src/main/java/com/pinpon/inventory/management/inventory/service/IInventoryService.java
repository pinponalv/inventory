package com.pinpon.inventory.management.inventory.service;

import com.pinpon.inventory.management.inventory.dto.CreateInventoryRequestDTO;
import com.pinpon.inventory.management.inventory.dto.ResponseInventoryDTO;
import com.pinpon.inventory.management.inventory.dto.UpdateInventoryRequestDTO;

import java.util.List;

public interface IInventoryService {
    ResponseInventoryDTO createInventory(CreateInventoryRequestDTO requestDTO);
    List<ResponseInventoryDTO> findAll();
    ResponseInventoryDTO findById(Long id);
    ResponseInventoryDTO updateInventory(Long id, UpdateInventoryRequestDTO requestDTO);
    void deleteInventory(Long id);

    ResponseInventoryDTO findByProductName(String productName);
    ResponseInventoryDTO findByWarehouseName(String warehouseName);
}