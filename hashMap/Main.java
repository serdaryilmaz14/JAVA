package hashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> telefonRehberi = new HashMap<>();
		
		telefonRehberi.put("Ali", 111222333);
		telefonRehberi.put("Veli", 222333444);
		telefonRehberi.put("Mehmet", 333444555);
		
		int telefon = telefonRehberi.get("Veli");
		System.out.println("Veli'nin telefon numarasi: " + telefon);
	}

}
