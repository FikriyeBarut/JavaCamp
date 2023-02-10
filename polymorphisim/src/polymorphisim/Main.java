package polymorphisim;

public class Main {
	
	public static void main(String[] args) {
		//BaseLogger türünden bir array olusturuldu
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesajý");
//		}
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger()); //boylelikle databaselogger degistirilebilir hale geldi
		customerManager.add();
	}

}
