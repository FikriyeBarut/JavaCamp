
public class Main {

	public static void main(String[] args) {
	
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar =new int[] {1,2,3,4,5};
		int aranacak=5;
		boolean varMý=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMý=true;
				break;
			}
		}
		if(varMý==true) {
			mesajVer("Bulundu" +aranacak);
		}else {
			mesajVer("Sayi mevcut deðildir.");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
