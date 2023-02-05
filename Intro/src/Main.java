
public class Main {

	public static void main(String[] args) {
	System.out.println("Hello caným");
	
	//degisken isimleri javada camelCase
	String ortaMetin="ilginizi çekebiliriz";
	String altMetin="Vade seviyesi";
	
	System.out.println(ortaMetin+ " " +altMetin);
	
	int Vade=15;
	double dolarDun=13.4;
	double dolarBugun=13.4;
	
	boolean dolarDustuMu=true;
	
	String okYonu="up.svg";
	String okYon="down.svg";
	
	if(dolarDun<dolarBugun) {
		System.out.println(okYonu);
	} 
	else if(dolarDun==dolarBugun) {
		System.out.println("Esit");
	}
	else
	{
		System.out.println(okYon);
	}
	
	String[] krediler = {"Hýzlý Kredi","Mutlu-Emekli,","Ev Kredisi"};
	
	for(int i=0; i<krediler.length; i++) {
		System.out.println(krediler[i]);
	}
	
	}
}
