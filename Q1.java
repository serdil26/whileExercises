package WhileAlistirma;

public class Q1 {

	public static void main(String[] args) {
		// Bir say�n�n tam b�lenlerini ve tam b�lenlerinin toplam�n� bulun.

		int deger= 42;
		int bolen =1;
		int tamBolenlerToplami=0;
		
		while(bolen<=deger) {
			if (deger%bolen==0) {
				System.out.println(deger + " sayisi "+ bolen+ " sayisina tam bolunur");
				tamBolenlerToplami=tamBolenlerToplami + bolen;
			}
			bolen++;
		}
		System.out.println("Tam bolenlerin toplami :" +tamBolenlerToplami);
	}

}
