package bulut_odev;

import java.util.*;

public class odevaaa {
 public static void main(String arg[]) {
  System.out.println("Bir sayi girin: ");
  Scanner input = new Scanner(System.in);
  int sayi, s = 0, i = 0, basamak; // De�i�kenlerin tan�mlanmas�
  sayi = input.nextInt(); // Say�n�n girilmesi 
  while (sayi > 0){
   // �evirme i�leminin yap�lmas�   
   basamak = (int)((sayi % 2) * Math.pow(10, i));
   i++;
   sayi = sayi / 2;
   s = s + basamak;
  }
  // �evrilen say�n�n ekrana yazd�r�lmas�
  System.out.println(s); 
  input.close();
 }
}