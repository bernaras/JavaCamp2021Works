
public class Main {

	public static void main(String[] args) {
 
		Kategori kategori1 =new Kategori();
		kategori1.EgitmeninAdi="Engin Demiroð";
		kategori1.KursAdi="Java";
		kategori1.KursTamamlamaYuzdesi=57;
		
		Kategori kategori2 =new Kategori();
		kategori2.EgitmeninAdi="Engin Demiroð";
		kategori2.KursAdi="Python";
		kategori2.KursTamamlamaYuzdesi=0;
		
		Kategori kategori3= new Kategori( "C#","Engin Demiroð",12);
		
		
		Kategori [] kategoriler= {kategori1,kategori2,kategori3};
		for (Kategori kategori : kategoriler) {
			System.out.println("Eðitmenin adý: "+ kategori.EgitmeninAdi+" Kursun Adý: "+kategori.KursAdi  );
					}
		
		
		Egitmen egitmen1 =new Egitmen();
		egitmen1.EgitmeninAdi="Engin Demiroð";
		egitmen1.EgitmeninKurslarý="Java";
		
		Egitmen egitmen2 =new Egitmen();
		egitmen2.EgitmeninAdi="Unknown";
		egitmen2.EgitmeninKurslarý="Physics";
		
		KursManager kursManager = new KursManager();
		kursManager.KursSecimi(kategori1, egitmen1);
	}

}
