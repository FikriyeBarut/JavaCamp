package inharitanceDemo;

public class Main {
//polimorfizm
	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
	}

}
