package overriding;

public class BaseKrediManager {
	// eger ki public final double hesapla() olarak tan�mlasayd�k override
	// edilemezdi,metod oldu�u gibi kullan�lmak zorunda olurdu.
//	public final double hesapla(double tutar) {
//		return tutar * 1.18;
//	}
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
