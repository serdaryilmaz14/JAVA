package getAndSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogrenci ogrenci = new Ogrenci();
		
		ogrenci.setAd("Mehmet");
		ogrenci.setYas(35);
		
		System.out.println("Ogrenci Adi: "+ ogrenci.getAd());
		System.out.println("Ogrenci Yasi: "+ ogrenci.getYas());
	}

}
