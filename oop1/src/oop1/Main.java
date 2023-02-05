package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj="Vade orani";
		
		Product product1=new Product();
		//set value
		product1.setName("Kahve makinesi");
		product1.setUnitInStock(15);
		product1.setDiscount(30);
		product1.setUnitPrice(2500);
		product1.setImageUrl("image.jpg");
		
		
		Product product2=new Product();
		//set value
		product2.setName("Çamaþýr makinesi");
		product2.setUnitInStock(150);
		product2.setDiscount(20);
		product2.setUnitPrice(52500);
		product2.setImageUrl("image2.jpg");
		
		Product product3=new Product();
		//set value
		product3.setName("Telefon");
		product3.setUnitInStock(250);
		product3.setDiscount(10);
		product3.setUnitPrice(1500);
		product3.setImageUrl("image3.jpg");

		
		Product[] products= {product1,product2,product3};
		

		for (Product product : products) {
			System.out.println(product.getName());
		}
		IndividualCustomer indivialCustomer=new IndividualCustomer();
		indivialCustomer.setId(1);
		indivialCustomer.setCustomerNumber("123");
		indivialCustomer.setPhone("0543");
		indivialCustomer.setFirstName("Fikriye");
		indivialCustomer.setLastName("Barut");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("123456");
		corporateCustomer.setTaxtNumber("222");
		
		Customer[] customers={indivialCustomer,corporateCustomer};
		//get value
		//System.out.println(product1.name);
	}

}
