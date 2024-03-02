import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
//Not Ortalaması Hesaplayan Program
public class notortalamasıHesaplama {
    // Projenin içindekiler
    // 1.) Kullanıcı girişi 
    // 2.) Sınav adeti alarak ortalamayı hesapla
   public static void main(String[] args)
   { 
    // Kullanıcı girişi  
    int parola = 4396;
    String kullaniciAdi = "havintemur";
    Scanner oku = new Scanner(System.in);

    System.out.print("Kullanıcı adı: ");
    String girilenKullaniciAdi = oku.nextLine();
    System.out.print("Parola: ");
    int girilenParola = oku.nextInt();
    oku.nextLine(); // Tamponu temizle

    if (kullaniciAdi.equals(girilenKullaniciAdi) && girilenParola == parola) // String ifadelerde karşılaştırma yapılırken equals kullanılır.
    {
      System.out.println("Giriş Başarılı");
    } 
    else if (!kullaniciAdi.equals(girilenKullaniciAdi) && girilenParola == parola)
    {
      System.out.println("Kullanıcı adı hatalı ");
    } 
    else if (kullaniciAdi.equals(girilenKullaniciAdi) && girilenParola != parola)
    {
      System.out.println("Parola hatalı");
    } 
    else 
    {
      System.out.println("Kullanıcı adı ve parola hatalı");
    }
    // Ortalama hesaplama
    System.out.print("Sınav adedi: ");
    int adet=oku.nextInt();
    float toplam=0;  //Toplam değişkenini saklamak için bu değişkeni kullanırız
    for(int i=1;i<=adet;i++)
    {
      System.out.print(i+ ".Sınav Sonucunuz: "); //Parantez içinde i olmasının sebebi, 1.Sınaf,2.Sınav şeklinde başındaki sayının adet sayısına kadar artamasını sağlar. 
      int sonuc=oku.nextInt();
      toplam+=sonuc;
    }
    System.out.println("Toplam Sonucu: "+toplam);
    System.out.println("Ortalama: "+(toplam/adet));
   }   
}