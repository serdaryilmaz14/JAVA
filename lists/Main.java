package lists;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> havaDurumu = new ArrayList<>();
		havaDurumu.add("Gunesli");
		havaDurumu.add("Karli");
		havaDurumu.add("Yagmurlu ");
		havaDurumu.add("Parcali Bulutlu");
		
		System.out.println(havaDurumu.get(0));
		System.out.println(havaDurumu.get(1));
		System.out.println(havaDurumu.get(2));
		System.out.println(havaDurumu.get(3));
	}

}
