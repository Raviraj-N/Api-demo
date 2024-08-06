//package com.example.demo.mapper;
//
//import com.example.demo.dto.Productdto;
//
//import com.example.demo.entity.Product;
//
//
//public class ProductMapper {
//       
//	  public static Productdto mapToProductdto(Product product){
//	        return new Productdto(
//	                product.getId(),
//	                product.getName(),
//	                product.getEmail(),
//	                product.getAddress(),
//	                product.getLandmark(),
//	                product.getPhoneno(),
//	                product.getDeliveryTime(),
//	                product.getRating()
//	                
//	        );
//	    }
//
//	    public static Product mapToProduct(Productdto productDto){
//	        return new Product(
//	        		
//	        		    productDto.getId(),
//		                productDto.getName(),
//		                productDto.getEmail(),
//		                productDto.getAddress(),
//		                productDto.getLandmark(),
//		                productDto.getPhoneno(),
//		                productDto.getDeliveryTime(),
//		                productDto.getRating()
//		        
//		                
//	                
//	               
//	        );
//	    }
//
//}
