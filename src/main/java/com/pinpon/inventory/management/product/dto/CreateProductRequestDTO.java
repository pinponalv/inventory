package com.pinpon.inventory.management.product.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateProductRequestDTO {
    @NotBlank
    private String name;
    @NotBlank
    @Size(min = 1, max = 200)
    private String description;
    @NotNull
    @Positive
    private BigDecimal price;
}
