
public class Main {

	public static void main(String[] args) {
 
		Kategori kategori1 =new Kategori();
		kategori1.EgitmeninAdi="Engin Demiro�";
		kategori1.KursAdi="Java";
		kategori1.KursTamamlamaYuzdesi=57;
		
		Kategori kategori2 =new Kategori();
		kategori2.EgitmeninAdi="Engin Demiro�";
		kategori2.KursAdi="Python";
		kategori2.KursTamamlamaYuzdesi=0;
		
		Kategori kategori3= new Kategori( "C#","Engin Demiro�",12);
		
		
		Kategori [] kategoriler= {kategori1,kategori2,kategori3};
		for (Kategori kategori : kategoriler) {
			System.out.println("E�itmenin ad�: "+ kategori.EgitmeninAdi+" Kursun Ad�: "+kategori.KursAdi  );
					}
		
		
		Egitmen egitmen1 =new Egitmen();
		egitmen1.EgitmeninAdi="Engin Demiro�";
		egitmen1.EgitmeninKurslar�="Java";
		
		Egitmen egitmen2 =new Egitmen();
		egitmen2.EgitmeninAdi="Unknown";
		egitmen2.EgitmeninKurslar�="Physics";
		
		KursManager kursManager = new KursManager();
		kursManager.KursSecimi(kategori1, egitmen1);
	}

}
