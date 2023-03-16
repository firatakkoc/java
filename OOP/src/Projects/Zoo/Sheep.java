package Projects.Zoo;

public class Sheep extends Animal {
    
    public String color;
    
    
    public Sheep(int id, String name, int age, String color) {
        super(id, name, age);
        this.color = color;
    }


    public void cut(){
        System.out.println("---Cutting---");
    }
}
