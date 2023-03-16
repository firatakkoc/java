package Projects.Zoo;

public class Dog extends Animal {
    
    public Dog(int id, String name, int age) {
        super(id, name, age);
    }

    public void makeWalk(){
        System.out.println("---The walk was made---");
    }

    public void giveTraining() {
        System.out.println("---Trained---");
    }

    
}
