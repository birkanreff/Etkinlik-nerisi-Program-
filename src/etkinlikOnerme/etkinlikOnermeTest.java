package etkinlikOnerme;

import java.util.Scanner;

public class etkinlikOnermeTest {

	public static void main(String[] args) {
		
		String menu = "Hava sıcaklığı değeri 5'ten küçük ise 1'e basınız \n"
				+ "Hava sıcaklığı 5 ile 15 değeri arasında ise 2'ye basınız \n"
				+ "Hava sıcaklığı 15 ile 25 arasında ise 3'e basınız \n"
				+ "Hava sıcaklığı 25'ten fazla ise 4'e basınız." ;
		System.out.println(menu);
		
		System.out.println("Lütfen hava sıcaklığı aralığını  seçiniz: ");
		Scanner input = new Scanner(System.in);
		
	int sicaklik = input.nextInt();
	
	switch(sicaklik) {
	case(1):
		System.out.println("Kayak yapabilirsiniz.");
	break;
	
	case(2):
		System.out.println("Sinemaya gidebilirsiniz.");
	break;
	
	case(3):
		System.out.println("Piknik yapabilirsiniz. ");
	break;
	
	case(4):
		System.out.println("Yüzmeye gidebilirsiniz. ");
	break;
	
	default:
		System.out.println("Yanlış değer girdiniz! ");
		
		
	
	
	}
		
		
				

	}

}
