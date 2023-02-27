package Constructors.ConstMethods;

public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefon;


    // Constructor Olusturma;
    // Ismini Class ile ayni yapmaliyiz;
    // Ayni olmazsa otomatik olarak cagirilmaz;
    // Objeler olusturulurken ilk cagrilan fonksiyon;
    // Deger vererek obje olusturabiliriz;
    // Method-Overloading Yapilmis oluyor;

    // Normal Constructor

    public Account() {
        //System.out.println("Manual Constructor");
        // this.hesapNo = "Bilgi Yok";
        // this.bakiye = 0.0;
        // this.isim = "Bilgi Yok";
        // this.email = "Bilgi Yok";
        // this.telefon = "Bilgi Yok";
        
        this("12345678", 1000.0, "Firat Akkoc","@gmail.com","1234567890");
    }

    // Icine deger gönderilen Constructor
    public Account(String hesapNo, double bakiye, String isim, String email, String telefon) {
        
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
    }

        // bilgileri gösteren method
    public void bilgilerigoster(){
        System.out.println("Hesap No: " + this.hesapNo);
        System.out.println("Bakiye: " + this.bakiye);
        System.out.println("Isim: " + this.isim);
        System.out.println("Email: " + this.email);
        System.out.println("Telefon:" + this.telefon);
    }
    
    // Para Cekme
    public void paraYatir(double miktar) {

        bakiye  += miktar;
        System.out.println("Yeni Bakiye: " +  bakiye);
    }
    // Para Yatirma
    public void paraCekme(double miktar) {
        
        if (miktar > 1500) {
            System.out.println("Bir günde 1500 TL üzerinde cekim yapilamaz");
        }
        if (bakiye - miktar < 0) {
            System.out.println("Yeterli Bakiye Yok: " + bakiye);
        }
        else {
            bakiye -= miktar;
            System.out.println("Güncel Bakiye:" + bakiye);
        }
    }
    
    public String getHesapNo() {
        return hesapNo;
    }
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
}
