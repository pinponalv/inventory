package com.pinpon.inventory.management.inventory.repository;

import com.pinpon.inventory.management.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IInventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findByProductIdAndWarehouseId(Long productId, Long warehouseId);

    //TODO: AGREGAR EL BUSCAR POR PRODUCTO Y ALMACEN
}
