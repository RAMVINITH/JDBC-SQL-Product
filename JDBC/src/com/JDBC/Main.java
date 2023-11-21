package com.JDBC;

import java.sql.SQLException;
import java.util.*;

import com.DAO.ProductDao;
import com.exception.ArrayGotFulled;
import com.exception.DuplicateProduct;
import com.exception.EmptyProduct;
import com.exception.ProductNOTFOUNDEXCEPTION;
import com.service.ProductService;

public class Main {

	public static void main(String[] args) throws ArrayGotFulled,ProductNOTFOUNDEXCEPTION, DuplicateProduct, ClassNotFoundException, SQLException, EmptyProduct {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Apple",100,3,5);
		Product p2=new Product(2,"Mango",200,4,10);
		Product p3=new Product(3,"Grape",100,5,40);
		Product p4=new Product(4,"Orange",70,6,30);
		Product p5=new Product(5,"Pineapple",250,7,20);
		
		ProductService service=new ProductService();
		

		
		
	// Adding products into List	
//		service.add(p1);
//		service.add(p2);
//		service.add(p3);
//		service.add(p4);
//		service.add(p5);
		
		
   //Deleting Product by using Product ID
//		service.deleteProd(3);
			
   //Update Product by using Product ID
//		service.update(1, "grape", 50, 5, 10); 
		
   //Search Product based on Product ID
//		service.searchProductById(1);
		
   //Search Product based on Product ID
//	    service.searchProductByName("grape");
		
   //Display all product by ascending order of price
//		service.displayProdByPrice();
		
    //Display all product by ascending order of Discount
//		service.displayProdByDiscount();		
		
   // Display All Products
//		service.display();

	}

}
