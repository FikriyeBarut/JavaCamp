package mukkemmelSayi;

public class Main {

	public static void main(String[] args) {
		// kendinden baþka pozitif tam bölenlerinin sayýsýnýn toplamý kendisine eþit olan sayý
	int number =6;
	int toplam = 0;
	
	if(number<0) {
		System.out.println("Geçersiz sayi.");
		return;
	}
	
	for(int i=1; i<number;i++) {
		if(number%i==0) {
			toplam=toplam+i;
		}
	}
	if(toplam==number) {
		System.out.println("Mukemmel sayi");
	}else {
		System.out.println("Mukemmel sayi degildir.");
	}
	
	

	}

}
