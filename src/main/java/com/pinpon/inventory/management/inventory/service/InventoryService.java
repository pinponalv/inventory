package com.pinpon.inventory.management.inventory.service;

import com.pinpon.inventory.management.inventory.dto.CreateInventoryRequestDTO;
import com.pinpon.inventory.management.inventory.dto.ResponseDTO;
import com.pinpon.inventory.management.inventory.dto.UpdateInventoryRequestDTO;
import com.pinpon.inventory.management.inventory.repository.IInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService implements IInventoryService {

    @Autowired
    private IInventoryRepository inventoryRepository;

    @Override
    public ResponseDTO createInventory(CreateInventoryRequestDTO requestDTO) {

        return null;
    }

    @Override
    public List<ResponseDTO> getAllInvetory() {
        return List.of();
    }

    @Override
    public ResponseDTO findInventoryById(Long id) {
        return null;
    }

    @Override
    public ResponseDTO updateInventory(Long id, UpdateInventoryRequestDTO requestDTO) {
        return null;
    }

    @Override
    public void deleteInventory(Long id) {

    }
}
