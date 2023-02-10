package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

//is kurallar� businessta yazilir.
public class ProductManager { // productService
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
	this.productDao = productDao;
	this.loggers=loggers;
}

	public void add(Product product) throws Exception {
		// business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Urun 10dan kucuk olamaz");
		}

		// dbcProductDao productDao=new JdbcProductDao();
		// roductDao.Add(product);

		// bir katman di�er bir katman�n class�n� kullan�yorsa sadece interface'inden eri�im kurmal�d�r.

		productDao.Add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
