package com.semairem.otoGaleri;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		boolean donguDevamEdiyor = true;
		do {
			
			Menu.menuYazdir();
			System.out.print("Se�iminiz=");
			int secim = scanner.nextInt();
			switch (secim) {
			
			case 1:
				System.out.println("Ara� Sorgulanacak");
				
				break;

			case 2:
				System.out.println("Ara� Eklenecek");
				
				break;
				
			case 3:
				System.out.println("Ara� Kiralanacak");
				
				break;

			case 4:
				System.out.println("Ara� Listelenecek");
				
				break;
				
			case 5:
				System.out.println("�al��anlar Sorgulanacak");
				
				break;

			case 6:
				System.out.println("�al��an Eklenecek");
				
				break;
				
			case 7:
				System.out.println("��k�� Yap�lacak");
				donguDevamEdiyor=false;
				
				break;

			default:
				System.out.println("Hatal� Se�im Yapt�n�z");
				
				break;
			}
		} 
		while (donguDevamEdiyor);
	}
		
}
		
	
