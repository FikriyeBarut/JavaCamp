package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void Add(Product product) {
		//sadece db erisim kodlar� yazilir...
		System.out.println("Hibernate ile veritaban�na eklendi.");
	}
}
