package Inheritance;


// Inhertance : Bir Class'in baska bir Class'dan özelliklerini ve methodlarini miras almasidir; IS - A Yapisi

public class Test {
    public static void main(String[] args) {
        
        Yönetici yönetici1 = new Yönetici("Firat Akkoc", 2500, "IT", 10 );
        yönetici1.bilgileriGöster();
        yönetici1.zam_yap(200);

    }
}