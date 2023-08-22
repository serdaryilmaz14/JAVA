package javaEx1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcının girdiği sayıların toplamını bulmak.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç tane say gireceksiniz?");
		int n = scanner.nextInt();
		int toplam = 0;
		
		for (int i=1; i<=n; i++) {
			System.out.println(i+ ". Sayıyı girin");
			int sayi = scanner.nextInt();
			toplam = toplam+sayi;
		}
		System.out.println("Girilen sayıları toplamı: "+ toplam);
	}

}
