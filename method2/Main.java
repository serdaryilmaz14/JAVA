package method2;

public class Main {
	
	public static int topla(int x, int y) {
		int toplama = x+y;
		return toplama;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dönüş değeri olan metod örneği
		
		int x = 10;
		int y = 20;
		
		int sonuc = topla(x, y);
		System.out.println("Toplam: "+ sonuc);
	}

}
