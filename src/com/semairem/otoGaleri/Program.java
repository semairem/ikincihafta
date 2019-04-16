package com.semairem.otoGaleri;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		boolean donguDevamEdiyor = true;
		do {
			
			Menu.menuYazdir();
			System.out.print("Seçiminiz=");
			int secim = scanner.nextInt();
			switch (secim) {
			
			case 1:
				System.out.println("Araç Sorgulanacak");
				
				break;

			case 2:
				System.out.println("Araç Eklenecek");
				
				break;
				
			case 3:
				System.out.println("Araç Kiralanacak");
				
				break;

			case 4:
				System.out.println("Araç Listelenecek");
				
				break;
				
			case 5:
				System.out.println("Çalýþanlar Sorgulanacak");
				
				break;

			case 6:
				System.out.println("Çalýþan Eklenecek");
				
				break;
				
			case 7:
				System.out.println("Çýkýþ Yapýlacak");
				donguDevamEdiyor=false;
				
				break;

			default:
				System.out.println("Hatalý Seçim Yaptýnýz");
				
				break;
			}
		} 
		while (donguDevamEdiyor);
	}
		
}
		
	
