package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar *0.25;//miras ald��� s�n�f� ezdi
	}
}
