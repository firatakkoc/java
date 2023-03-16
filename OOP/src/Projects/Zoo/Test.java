package Projects.Zoo;

public class Test {
    public static void main(String[] args) {
        
        Sheep sheep = new Sheep(1102, "Dolly", 2, "Brown");

        System.out.println(sheep.getName());
        sheep.feeding("grass");
        sheep.cut();
        sheep.makeVaccine();

        System.out.println("-------------------------------");
        Horse horse = new Horse(1013, "Welly", 6, 1.05, 80);

        System.out.println(horse.getName());
        horse.clean();
        horse.giveTraining();
        horse.giveWater();
    }
}
