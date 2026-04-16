package com.pinpon.inventory.management.inventoryMovement.service;

import com.pinpon.inventory.management.inventoryMovement.dto.CreateMovementDTO;
import com.pinpon.inventory.management.inventoryMovement.dto.ResponseMovementDTO;
import com.pinpon.inventory.management.inventoryMovement.dto.UpdateMovementDTO;
import com.pinpon.inventory.management.inventoryMovement.entity.InventoryMovement;
import com.pinpon.inventory.management.inventoryMovement.mapper.InventoryMovementMapper;
import com.pinpon.inventory.management.inventoryMovement.repository.IMovementRepository;
import com.pinpon.inventory.management.product.entity.Product;
import com.pinpon.inventory.management.product.repository.IProductRepository;
import com.pinpon.inventory.management.supplier.entity.Supplier;
import com.pinpon.inventory.management.supplier.repository.ISupplierRepository;
import com.pinpon.inventory.management.warehouse.entity.Warehouse;
import com.pinpon.inventory.management.warehouse.repository.IWarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementService implements IMovementService {
    @Autowired
    private IMovementRepository movementRepository;

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IWarehouseRepository warehouseRepository;

    @Autowired
    private ISupplierRepository supplierRepository;

    @Autowired
    private InventoryMovementMapper inventoryMovementMapper;

    @Override
    public ResponseMovementDTO createMovement(Long productId, Long warehouseId, Long userId, Long supplierId, CreateMovementDTO requestDTO) {
        Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("product not found"));
        Warehouse existingWarehouse = warehouseRepository.findById(warehouseId).orElseThrow(() -> new RuntimeException("warehouse not found"));
        Supplier  existingSupplier = supplierRepository.findById(supplierId).orElseThrow(() -> new RuntimeException("supplier not found"));

        InventoryMovement movement = new  InventoryMovement();
        movement.setProductss(existingProduct);
        movement.setWarehouse(existingWarehouse);
        movement.setSupplier(existingSupplier);
        movement.setQuantity(requestDTO.getQuantity());
        movement.setTypeMovement(requestDTO.getTypeMovement());

        InventoryMovement savedMovent = movementRepository.save(movement);

        return inventoryMovementMapper.toDTO(savedMovent);
    }

    //TODO: CONTINUAR AQUI

    @Override
    public List<ResponseMovementDTO> findAllMovement() {
        return List.of();
    }

    @Override
    public ResponseMovementDTO findMovementById(Long id) {
        return null;
    }

    @Override
    public ResponseMovementDTO updateMovement(Long id, UpdateMovementDTO requestDTO) {
        return null;
    }

    @Override
    public void deleteMovement(Long id) {

    }
}
