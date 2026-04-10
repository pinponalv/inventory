package com.pinpon.inventory.management.product.controller;

import com.pinpon.inventory.management.product.dto.CreateProductRequestDTO;
import com.pinpon.inventory.management.product.dto.ResponseProductDTO;
import com.pinpon.inventory.management.product.dto.UpdateProductRequestDTO;
import com.pinpon.inventory.management.product.service.IProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@Tag(name = "Products", description = "Products API Operations")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping
    public ResponseEntity<ResponseProductDTO> createProduct(@Valid @RequestBody CreateProductRequestDTO requestDTO){
        ResponseProductDTO response = productService.createProduct(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<ResponseProductDTO>> getAllProducts(){
        List<ResponseProductDTO> response = productService.findAllProducts();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseProductDTO> getProduct(@PathVariable Long id){
        ResponseProductDTO response = productService.findProductById(id);
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseProductDTO> updateProduct(@PathVariable Long id, @Valid @RequestBody UpdateProductRequestDTO requestDTO){
        ResponseProductDTO response = productService.updateProduct(id, requestDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseProductDTO> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return  ResponseEntity.noContent().build();
    }

}
