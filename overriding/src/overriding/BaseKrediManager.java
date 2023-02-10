package overriding;

public class BaseKrediManager {
	// eger ki public final double hesapla() olarak tanımlasaydık override
	// edilemezdi,metod olduğu gibi kullanılmak zorunda olurdu.
//	public final double hesapla(double tutar) {
//		return tutar * 1.18;
//	}
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
