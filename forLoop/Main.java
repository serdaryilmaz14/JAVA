package forLoop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tek Sayıları Toplama
		
		int toplam = 0 ;
		
		for (int i=1; i<=10; i++) {
			if(i % 2 ==1) {
				toplam += i; 
			}	
		}
		System.out.println("Tek sayilarin toplami: "+ toplam);
	}

}
