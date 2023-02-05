
public class Main {

	public static void main(String[] args) {
		int number =45;
		int remainder = number %2;
		boolean isPrime=true;
		
		if(number==1) {
			System.out.println("Asal degildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i=2; i<number; i++) {
			if(number %i==0) {
				isPrime=false;
		}
	}
		if(isPrime==false) {
			System.out.println("Sayı asal değil");
		}
		else {
			System.out.println("Sayı asal");
		}

}
}
