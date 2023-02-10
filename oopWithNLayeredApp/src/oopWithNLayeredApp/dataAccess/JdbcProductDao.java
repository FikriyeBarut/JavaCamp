package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//jdbc database erisim yontemi

public class JdbcProductDao implements ProductDao { // dao dataAccessObject veritabaný nesnesi
	public void Add(Product product) {
		//sadece db erisim kodlarý yazilir...
		System.out.println("Jdbc ile veritabanýna eklendi.");
	}

}
