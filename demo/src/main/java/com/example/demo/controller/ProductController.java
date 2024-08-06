//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.demo.dto.Productdto;
//import com.example.demo.service.ProductService;
//
//@CrossOrigin("")
//@RestController
//@RequestMapping("/api/products")
//public class ProductController {
//	
//	 @Autowired
//	    private ProductService productService;
//
//	    @GetMapping
//	    public List<Productdto> getAllProducts() {
//	        return productService.getAllProducts();
//	    }
//
//	    @GetMapping("/{id}")
//	    public Productdto getProductById(@PathVariable Long id) {
//	        return productService.getProductById(id);
//	    }
//
//	    @PostMapping
//	    public Productdto createProduct(@RequestBody Productdto Productdto) {
//	        return productService.createProduct(Productdto);
//	    }
//
//	    @PutMapping("/{id}")
//	    public Productdto updateProduct(@PathVariable Long id, @RequestBody Productdto Productdto) {
//	        return productService.updateProduct(id, Productdto);
//	    }
//
//	    @DeleteMapping("/{id}")
//	    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
//	        productService.deleteProduct(id);
//	        return ResponseEntity.noContent().build();
//	    }
//
//}
