<<<<<<< HEAD
package WhileAlistirma;

public class Q1 {

	public static void main(String[] args) {
		// Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

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
=======
package WhileAlistirma;

public class Q1 {

	public static void main(String[] args) {
		// Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

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
>>>>>>> 5f79b729e2697bd54ce788a86b2811938feeb89b
