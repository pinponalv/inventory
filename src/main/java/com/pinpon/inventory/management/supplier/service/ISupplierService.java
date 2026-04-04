package com.pinpon.inventory.management.supplier.service;

import com.pinpon.inventory.management.supplier.dto.CreateSupplierRequestDTO;
import com.pinpon.inventory.management.supplier.dto.SupplierResponseDTO;
import com.pinpon.inventory.management.supplier.dto.UpdateSupplierRequestDTO;

import java.util.List;

public interface ISupplierService {
    SupplierResponseDTO createSupplier(CreateSupplierRequestDTO requestDTO);
    List<SupplierResponseDTO> findAllSuppliers();
    SupplierResponseDTO findSupplierById(Long id);
    SupplierResponseDTO findSupplierByEmail(String email);
    SupplierResponseDTO updateSupplier(Long id, UpdateSupplierRequestDTO requestDTO);
    void deleteSupplierById(Long id);
}
