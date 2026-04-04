package com.pinpon.inventory.management.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseProductDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
