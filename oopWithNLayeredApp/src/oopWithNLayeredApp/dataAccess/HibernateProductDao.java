package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void Add(Product product) {
		//sadece db erisim kodları yazilir...
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
