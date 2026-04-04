package com.pinpon.inventory.management.supplier.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SupplierResponseDTO {
    private Long id;
    private String name;
    private String description;
    private String email;
    private String phone;
}
