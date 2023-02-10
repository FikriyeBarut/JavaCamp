package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//jdbc database erisim yontemi

public class JdbcProductDao implements ProductDao { // dao dataAccessObject veritabanı nesnesi
	public void Add(Product product) {
		//sadece db erisim kodları yazilir...
		System.out.println("Jdbc ile veritabanına eklendi.");
	}

}
