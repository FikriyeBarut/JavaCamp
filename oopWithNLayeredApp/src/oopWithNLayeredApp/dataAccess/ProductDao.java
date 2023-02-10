package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//interface sadece metod imzasını barındırır.
//birbirinin alternatifi bulunan durumlarda interface kullanılmalı.

public interface ProductDao { //productDao ile ilgili olan alternatifler add metodunu icermeli
	void Add(Product product);
}
