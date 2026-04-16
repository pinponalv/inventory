package com.pinpon.inventory.management.inventoryMovement.repository;

import com.pinpon.inventory.management.inventory.entity.Inventory;
import com.pinpon.inventory.management.inventoryMovement.entity.InventoryMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovementRepository extends JpaRepository<InventoryMovement, Long> {
}
