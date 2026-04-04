package com.pinpon.inventory.management.product.service;

import com.pinpon.inventory.management.product.dto.CreateProductRequestDTO;
import com.pinpon.inventory.management.product.dto.ResponseProductDTO;
import com.pinpon.inventory.management.product.dto.UpdateProductRequestDTO;
import com.pinpon.inventory.management.product.entity.Product;
import com.pinpon.inventory.management.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;


    @Override
    public ResponseProductDTO createProduct(CreateProductRequestDTO requestDTO) {
        Product product = new Product();
        product.setName(requestDTO.getName());
        product.setDescription(requestDTO.getDescription());
        product.setPrice(requestDTO.getPrice());

        Product savedProduct = productRepository.save(product);
        return new ResponseProductDTO(
                savedProduct.getId(),
                savedProduct.getName(),
                savedProduct.getDescription(),
                savedProduct.getPrice()
        );
    }

    @Override
    public ResponseProductDTO updateProduct(Long id, UpdateProductRequestDTO requestDTO) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id " + id));
        product.setName(requestDTO.getName());
        product.setDescription(requestDTO.getDescription());
        product.setPrice(requestDTO.getPrice());
        Product updatedProduct = productRepository.save(product);

        return new ResponseProductDTO(
                updatedProduct.getId(),
                updatedProduct.getName(),
                updatedProduct.getDescription(),
                updatedProduct.getPrice()
        );
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ResponseProductDTO findProductById(Long id) {
        Product product =  productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found with id " + id));

        return new ResponseProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

    @Override
    public List<ResponseProductDTO> findAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ResponseProductDTO> responseProductDTOS = new ArrayList<>();
        for (Product product : products) {
            ResponseProductDTO responseProductDTO = new ResponseProductDTO(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice()
            );
            responseProductDTOS.add(responseProductDTO);
        }
        return responseProductDTOS;
    }
}
