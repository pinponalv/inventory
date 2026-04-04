package com.pinpon.inventory.management.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateProductRequestDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotNull
    @Positive
    private BigDecimal price;
}
