package com.company;

public class Main {

    public static void main(String[] args) {
	  double [] list={1.2,1.5,1.9,1.4};
	  double toplam=0;
	  double maxSayi=list[0];
	  for(double number:list)
      {
          System.out.println(number);
          toplam+=number;
          if(number>maxSayi)
          {
              maxSayi=number;
          }
      }
	  System.out.println("Toplam= "+toplam);
	  System.out.println("Max sayi= "+maxSayi);
    }
}
