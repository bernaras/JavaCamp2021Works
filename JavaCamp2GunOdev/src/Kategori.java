
public class Kategori {
	
	String KursAdi; //fields
	String EgitmeninAdi;	
	int KursTamamlamaYuzdesi;
	
	public Kategori() { //constructor
		System.out.println("Yap�c� blok �al��t�.");
	}
	
	public Kategori(String KursAdi, String EgitmenAdi, int KursTamamlamaYuzdesi) {
		this();
		this.KursAdi=KursAdi;
		this.EgitmeninAdi=EgitmenAdi;
		this.KursTamamlamaYuzdesi=KursTamamlamaYuzdesi;
		
	}
	
	
	
}
