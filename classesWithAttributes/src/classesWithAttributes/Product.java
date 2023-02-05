package classesWithAttributes;

//attributes:field
public class Product {
	
	//constructor
	//product ,sadece bu parametreleri verilidðinde kullanýlýr
	public Product(int _id,String _name,int _price){
		System.out.println("Yapici blok çalýþtý");
		
		//kullanabilmek için yapýldý.set edildi
		this._id=_id;
		this._name=_name;
		this._price=_price;
		
	}
	public Product() {
		
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	
	
	//getter
	public int getId() {
		return _id;
	}
	//setter
	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

}
