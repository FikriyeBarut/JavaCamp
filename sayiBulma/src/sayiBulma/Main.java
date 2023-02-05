package sayiBulma;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Bulundu");
		}else {
			System.out.println("Sayi yok");
		}

	}

}
