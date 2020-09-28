package com.company;

public class Main {

    public static void main(String[] args) {
	String ogrenciler[]=new String[3];
	ogrenciler[0]="Halime";
	ogrenciler[1]="Aysun";
	ogrenciler[2]="Ebru";
	for(int i=0;i<ogrenciler.length;i++)
    {
        System.out.println(ogrenciler[i]);
    }
	//Ogrenciler dizisindeki her bir elemanı gez
   for(String ogrenci:ogrenciler){
       System.out.println(ogrenci);
   }
    }
}
