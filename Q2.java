package WhileAlistirma;

public class Q2 {

	public static void main(String[] args) {
		//  1'den 10'a kadar olan sayýlarýn faktöriyelini WHILE ile hazirlayalim.
		
		int fak=1;
		int carpan=1;
		while (carpan<=10) {
			fak= carpan*fak;
			System.out.println(carpan + "'in faktoryeli= " + fak);
			carpan++;
		}

	}

}
