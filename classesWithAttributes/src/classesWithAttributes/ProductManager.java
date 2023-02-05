package classesWithAttributes;
//operasyonlar
public class ProductManager {
	public void Add(Product product) {
		System.out.println("Urun eklendi"+product.name);
	}

	public void Delete(Product product) {
		System.out.println("Urun silindi");
	}

}
