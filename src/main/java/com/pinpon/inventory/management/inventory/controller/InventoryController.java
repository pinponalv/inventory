package com.pinpon.inventory.management.inventory.controller;

import com.pinpon.inventory.management.inventory.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @Autowired
    private IInventoryService inventoryService;
}
