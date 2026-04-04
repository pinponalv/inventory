package com.pinpon.inventory.management.warehouse.service;

import com.pinpon.inventory.management.warehouse.dto.CreateWarehouseDTO;
import com.pinpon.inventory.management.warehouse.dto.ResponseWarehouseDTO;
import com.pinpon.inventory.management.warehouse.dto.UpdateWarehouseDTO;

import java.util.List;

public interface IWarehouseService {
    ResponseWarehouseDTO createWarehouse(CreateWarehouseDTO requestDTO);
    ResponseWarehouseDTO updateWarehouse(Long id, UpdateWarehouseDTO requestDTO);
    void deleteWarehouse(Long id);
    List<ResponseWarehouseDTO> getWarehouses();
    ResponseWarehouseDTO getWarehouseById(Long id);
    ResponseWarehouseDTO getWarehouseByName(String name);
}
