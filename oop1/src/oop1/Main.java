package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		
		Product product1 = new Product();
		
//		set value
//		product1.name= "Delonghi Kahve Makinesi";
//		product1.unitPrice = 7500;
//		product1.discount = 7;
//		product1.unitsInStock = 1;
//		product1.imageUrl = "bilmemne.jpg";
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
//		get value 
//		 System.out.println(product1.name);

		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		
		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Emre");
		individualCustomer.setLastName("Saglam");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("053333333");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	}

}
