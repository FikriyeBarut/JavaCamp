package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//jdbc database erisim yontemi

public class JdbcProductDao implements ProductDao { // dao dataAccessObject veritaban� nesnesi
	public void Add(Product product) {
		//sadece db erisim kodlar� yazilir...
		System.out.println("Jdbc ile veritaban�na eklendi.");
	}

}
