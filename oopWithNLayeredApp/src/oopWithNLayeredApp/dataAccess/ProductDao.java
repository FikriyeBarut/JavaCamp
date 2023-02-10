package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//interface sadece metod imzasýný barýndýrýr.
//birbirinin alternatifi bulunan durumlarda interface kullanýlmalý.

public interface ProductDao { //productDao ile ilgili olan alternatifler add metodunu icermeli
	void Add(Product product);
}
