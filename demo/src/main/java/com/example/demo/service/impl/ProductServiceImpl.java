//package com.example.demo.service.impl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.example.demo.dto.Productdto;
//import com.example.demo.entity.Product;
//import com.example.demo.entity.Signup;
//import com.example.demo.exception.Resourcenotfoundexception;
//import com.example.demo.mapper.ProductMapper;
//import com.example.demo.mapper.SignupMapper;
//import com.example.demo.repository.ProductRepository;
//import com.example.demo.service.ProductService;
//
//import jakarta.transaction.Transactional;
//
//@Service
//@Transactional
//public class ProductServiceImpl implements ProductService{
//	
//	 private  ProductRepository productRepository;
//	    private ProductMapper productMapper;
//
//	    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
//	        this.productRepository = productRepository;
//	        this.productMapper = productMapper;
//	    }
//
//	    @Override
//	    public List<Productdto> getAllProducts() {
//	        return productRepository.findAll().stream()
//	            .map(ProductMapper::mapToProduct)
//	            .collect(Collectors.toList());
//	    }
//
//	    @Override
//	    public Productdto getProductById(Long id) {
//	        Product product = productRepository.findById(id)
//	            .orElseThrow(() -> new Resourcenotfoundexception("Product not found with id: " + id));
//	        return ProductMapper.mapToProductdto(product);
//	    }
//
//	    @Override
//	    public Productdto createProduct(Productdto productDTO) {
//	        Product product = ProductMapper.mapToProduct(productDTO);
//	        return ProductMapper.mapToProductdto(productRepository.save(product));
//	    }
//
//	    @Override
//	    public Productdto updateProduct(Long id, Productdto productDTO) {
//	        Product product = productRepository.findById(id)
//	            .orElseThrow(() -> new Resourcenotfoundexception("Product not found with id: " + id));
//
//	        product.setName(productDTO.getName());
//	        product.setEmail(productDTO.getEmail());
//	        product.setAddress(productDTO.getAddress());
//	        product.setLandmark(productDTO.getLandmark());
//	        product.setPhoneno(productDTO.getPhoneno());
//	        product.setDeliveryTime(productDTO.getDeliveryTime());
//	        product.setRating(productDTO.getRating());
//
//	        Product updatedProductObj = productRepository.save(product);
//
//	        return ProductMapper.mapToProductdto(updatedProductObj);
//	    }
//
//	    @Override
//	    public void deleteProduct(Long id) {
//	        Product product = productRepository.findById(id)
//	            .orElseThrow(() -> new Resourcenotfoundexception("Product not found with id: " + id));
//	        productRepository.delete(product);
//	    }
//	}
//
//
