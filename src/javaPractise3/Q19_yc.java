package javaPractise3;

import java.util.Scanner;

public class Q19_yc {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
               
               
               şeklini konsola yazdiriniz.
     */

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		System.out.print("matrisin boyutunu giriniz : ");
		int satirSayisi=scan.nextInt();
		
    	for (int satir = 0; satir <satirSayisi; satir++) {
    		
    		for (int bosluk = 0; bosluk < satirSayisi-(satir+1); bosluk++) {
				System.out.println(" ");
			}
			for (int yildiz = 0; yildiz <1+(satir*2); yildiz++) {
				System.out.print("*");
			}
		}System.out.println();
		scan.close();
    }
}

