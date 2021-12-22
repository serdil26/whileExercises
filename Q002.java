package WhileAlistirma;

public class Q002 {

	public static void main(String[] args) {
		// BIR ARRAY ICERISINDEKI SAYILARIN TOPLAMINI WHILE DONGUSU ILE HESAPLAYIN
		
		int []array= {4,7,10,20,35,40, 4, 20, 30,25,5};
		
		int sira=0;
		int uzunluk= array.length;
		int toplam=0;
		
		while (sira<uzunluk) {
			toplam+= array[sira];
			sira++;
		}
		System.out.println("Array icindeki sayilar toplami: " + toplam);

	}

}
