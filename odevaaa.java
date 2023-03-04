package bulut_odev;

import java.util.*;

public class odevaaa {
 public static void main(String arg[]) {
  System.out.println("Bir sayi girin: ");
  Scanner input = new Scanner(System.in);
  int sayi, s = 0, i = 0, basamak; // Deðiþkenlerin tanýmlanmasý
  sayi = input.nextInt(); // Sayýnýn girilmesi 
  while (sayi > 0){
   // Çevirme iþleminin yapýlmasý   
   basamak = (int)((sayi % 2) * Math.pow(10, i));
   i++;
   sayi = sayi / 2;
   s = s + basamak;
  }
  // Çevrilen sayýnýn ekrana yazdýrýlmasý
  System.out.println(s); 
  input.close();
 }
}