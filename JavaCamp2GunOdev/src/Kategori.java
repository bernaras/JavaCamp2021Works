
public class Kategori {
	
	String KursAdi; //fields
	String EgitmeninAdi;	
	int KursTamamlamaYuzdesi;
	
	public Kategori() { //constructor
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	public Kategori(String KursAdi, String EgitmenAdi, int KursTamamlamaYuzdesi) {
		this();
		this.KursAdi=KursAdi;
		this.EgitmeninAdi=EgitmenAdi;
		this.KursTamamlamaYuzdesi=KursTamamlamaYuzdesi;
		
	}
	
	
	
}
