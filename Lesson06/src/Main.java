
public class Main {

	public static void main(String[] args) {
		Calisan c1 = new Calisan("Emre Can Satık", "53400000", "emrecanstk@gmail.com");
		Akademisyen a1 = new Akademisyen("Ahmet Saygılı", "050000000", "asaygili@nku.edu.tr","Bilgisayar Mühendisliği","Prof.");
		
		c1.giris();
		a1.giris();
		a1.derseGir();
		
		// Method'u aşırı yükleme (OverLoadig)
		a1.giris("08.45");
	}

}
