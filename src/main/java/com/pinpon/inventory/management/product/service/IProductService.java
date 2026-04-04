package com.pinpon.inventory.management.product.service;

import com.pinpon.inventory.management.product.dto.CreateProductRequestDTO;
import com.pinpon.inventory.management.product.dto.ResponseProductDTO;
import com.pinpon.inventory.management.product.dto.UpdateProductRequestDTO;

import java.util.List;

public interface IProductService {
    ResponseProductDTO createProduct(CreateProductRequestDTO requestDTO);
    ResponseProductDTO updateProduct(Long id, UpdateProductRequestDTO requestDTO);
    void deleteProduct(Long id);
    ResponseProductDTO findProductById(Long id);
    List<ResponseProductDTO> findAllProducts();
}
