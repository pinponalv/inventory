package com.pinpon.inventory.management.warehouse.repository;

import com.pinpon.inventory.management.warehouse.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWarehouseRepository extends JpaRepository<Warehouse, Long> {
    Warehouse getWarehouseByName(String name);
}
