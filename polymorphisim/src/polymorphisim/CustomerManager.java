package polymorphisim;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {//constructor
		this.logger=logger;
	}
	public void add() {
		System.out.println("Musteri eklendi");
		this.logger.log("Log mesaj�");
	}
}
