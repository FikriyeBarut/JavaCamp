package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//interface sadece metod imzas�n� bar�nd�r�r.
//birbirinin alternatifi bulunan durumlarda interface kullan�lmal�.

public interface ProductDao { //productDao ile ilgili olan alternatifler add metodunu icermeli
	void Add(Product product);
}
