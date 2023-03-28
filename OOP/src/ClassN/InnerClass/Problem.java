package ClassN.InnerClass;

public class Problem {
    
    // iki adet static inner class olusturuyoruz

    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("DAirenin Alani; "+ (Math.PI * yaricap * yaricap));
        }
        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3) {
            System.out.println("Ücgenin Cevresi: "+(kenar1+kenar2+kenar3));
        }

    }

    public static class Fizik{

        public static void icCarpim(Vec vec1, Vec vec2) {
            int icCarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec2.getK() * vec2.getK();

            System.out.println(vec1.getIsim() + " ile " +vec2.getIsim() + "in ic carpimi = "+ icCarpim) ;
        }
    }
}
