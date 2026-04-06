package com.pinpon.inventory.management.purchaseOrder.repository;

import com.pinpon.inventory.management.purchaseOrder.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
}
