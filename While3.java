package WhileAlistirma;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// girilen sayiya kadar olan 2nin kuvvetleri
		Scanner scan= new Scanner(System.in);
		System.out.println("sayi giriniz:");
		int input=scan.nextInt();
		int i=1;
		while (i<= input) {
			System.out.println(i);
			i= i*2;
		}
		

	}

}
