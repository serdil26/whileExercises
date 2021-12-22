package WhileAlistirma;

public class Q001 {

	public static void main(String[] args) {
		// bir sayinin rakamlari toplamini while dongusu ile bulan bir prg yaziniz
		
		int sayi=876543;
		int basamak=0;
		int toplam=0;
		
		while (sayi>0) {
			basamak=sayi %10;
			toplam+=basamak;
			sayi= sayi/10;
		}
		System.out.println("Basamak degerleri toplami: " + toplam);
		
	}
}
