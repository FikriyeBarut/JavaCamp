package sayiBulma;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Bulundu");
		}else {
			System.out.println("Sayi yok");
		}

	}

}
