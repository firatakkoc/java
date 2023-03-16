package Projects.Zoo;

public class Horse extends Animal{
    public double legSize;
    public int speed;
    

    public Horse(int id, String name, int age, double legSize, int speed) {
        super(id, name, age);
        this.legSize = legSize;
        this.speed = speed;
    }

    public void horseShoe(){
        System.out.println("---Change the horseshoe---");
    }

    public void giveTraining() {
        System.out.println("---Trained---");
    }
}
