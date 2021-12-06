package WhileAlistirma;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// soru 2 negatif bir deger girilene kadar kullanicidan girisleri kabul eden
		//ve girilen degerlerden tek sayilari toplayan program
		
		Scanner scan= new Scanner(System.in);
		
		int toplam=0;
		int input;
		while(true) {
		System.out.println("Lutfen sayi giriniz:");
		input=scan.nextInt();
		if (input<0) {
			System.out.println("Program bitti,  negatif sayi girdiniz");
			System.out.println("Girilen tek sayilar toplami: " + toplam);
			break;
		}
			
			if (input %2 ==1) {
				toplam+= input;
			}
		}
		

	}
	}


