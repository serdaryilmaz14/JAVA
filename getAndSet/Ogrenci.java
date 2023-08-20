package getAndSet;

public class Ogrenci {
	private String ad;
	private int yas;
	

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		if (yas >=0) {
			this.yas = yas;
		}else {
			System.out.println("Yaş negatif olamaz.");
		}
	}
}
