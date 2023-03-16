package Projects.Zoo;

public class Animal {
    private int id;
    private String name;
    private int age;
    

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void giveWater(){
        System.out.println("---Water has been given---");
    }

    public void makeVaccine() {
        System.out.println("---The Vaccine has been given---");
    }

    public void clean(){
        System.out.println("---The animal has been cleaned---");
    }

    public void feeding(String eat) {
        System.out.println("---The animal was fed with "+eat+"---");
    }


}
