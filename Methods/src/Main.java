
public class Main {

	public static void main(String[] args) {
	
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar =new int[] {1,2,3,4,5};
		int aranacak=5;
		boolean varM�=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varM�=true;
				break;
			}
		}
		if(varM�==true) {
			mesajVer("Bulundu" +aranacak);
		}else {
			mesajVer("Sayi mevcut de�ildir.");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
