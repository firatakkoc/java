package Constructors;
public class Test {
    public static void main(String[] args) {

        Araba araba1 = new Araba(); // bellekte bir yer olustuyoruz ve buna bir referans atiyoruz. 

        araba1.setRenk("Metslik Gri");
        System.out.println("Renk: " + araba1.getRenk());
        
        araba1.setKapilar(5);
        System.out.println("Kapilar: " + araba1.getKapilar());
        
        araba1.setTekerler(4);
        System.out.println("Tekerler: " + araba1.getTekerler());

        araba1.setMotor("16V");
        System.out.println("Motor:" + araba1.getMotor() );
        
        araba1.setMarka("Volvo");
        System.out.println("Marka: " + araba1.getMarka());
    }   
}
