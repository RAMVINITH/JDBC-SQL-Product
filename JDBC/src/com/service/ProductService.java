package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.JDBC.Product;
import com.exception.DuplicateProduct;
import com.exception.EmptyProduct;
import com.exception.ProductNOTFOUNDEXCEPTION;
import com.DAO.ProductDao;

public class ProductService {
	
	 ProductDao dao=new ProductDao();

	
	public void add(Product newProd) throws DuplicateProduct, ClassNotFoundException, SQLException
	{
		dao.add(newProd);
	}
	
	public void display() throws ClassNotFoundException, SQLException, EmptyProduct
	{ 
		dao.display();
	}
	
	public void update(int prodId,String prodName,int price,int quantity,int discount) throws ProductNOTFOUNDEXCEPTION, ClassNotFoundException, SQLException
	{
		dao.update(prodId, prodName, price, quantity, discount); 
	}
	
	
	public void deleteProd(int prodId)throws ProductNOTFOUNDEXCEPTION, ClassNotFoundException, SQLException
	{
		dao.deleteProd(prodId);
	}
	public void searchProductById(int prodId) throws ProductNOTFOUNDEXCEPTION, ClassNotFoundException, SQLException
	{
		Product prod=dao.searchProductById(prodId);
		if(prod!=null)
		{
			System.out.println("Product ID : " + prod.getProdID());
			System.out.println("Product name : " + prod.getProdName());
			System.out.println("Price : "+prod.getPrice() );
			System.out.println("Quantity : "+prod.getQuantity());
			System.out.println("Discount : "+ prod.getDiscount());
		}
		else
			throw new ProductNOTFOUNDEXCEPTION();
		
	}
	public void searchProductByName(String prodName) throws ProductNOTFOUNDEXCEPTION, ClassNotFoundException, SQLException
	{
		Product prod=dao.searchProductByName(prodName);
		if(prod!=null)
		{
			System.out.println("Product ID : " + prod.getProdID());
			System.out.println("Product name : " + prod.getProdName());
			System.out.println("Price : "+prod.getPrice() );
			System.out.println("Quantity : "+prod.getQuantity());
			System.out.println("Discount : "+ prod.getDiscount());
		}
		else
			throw new ProductNOTFOUNDEXCEPTION();
			

	}
	public void displayProdByPrice() throws ClassNotFoundException, SQLException, EmptyProduct
	{
		List<Product> newList = dao.displayProdByPrice();
		if(newList.isEmpty())
			throw new EmptyProduct();
		else
		{
			Collections.sort(newList, new Comparator<Product>() {
				public int compare(Product obj, Product obj1) {
					if(obj.getPrice()  > obj1.getPrice()) {
						return 1;
					}
					else if(obj.getPrice() == obj1.getPrice()) {
						return 0;
					}
					return -1;
	 			}
			});

			for(Product obj : newList)
			System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
		}

	}
	
	public void displayProdByDiscount() throws ClassNotFoundException, SQLException, EmptyProduct
	{
       
		
		List<Product> newList = dao.displayProdByDiscount();;
		if(newList.isEmpty())
			throw new EmptyProduct();
		else
		{
			Collections.sort(newList, new Comparator<Product>() {
				public int compare(Product obj, Product obj1) {
					if(obj.getDiscount()  > obj1.getDiscount()) {
						return 1;
					}
					else if(obj.getDiscount() == obj1.getDiscount()) {
						return 0;
					}
					return -1;
	 			}
			});

			for(Product obj : newList)
			System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
		}


	}


}
