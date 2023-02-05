package classesWithAttributes;
//encapsulation
public class Main {

	public static void main(String[] args) {
		Product product= new Product();
		Product product2 =new Product(1, "PC", 15);
		product.setName("Laptop");
		System.out.println(product.getName());
		product.setId(1);
		product.setPrice(5000);
		product.setStockAmount(5);
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		
		product.getName();
		
		}

}
