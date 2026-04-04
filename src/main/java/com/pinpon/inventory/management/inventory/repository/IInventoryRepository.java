package com.pinpon.inventory.management.inventory.repository;

import com.pinpon.inventory.management.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInventoryRepository extends JpaRepository<Inventory, Long> {
}
