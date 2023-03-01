package Constructors.ConstMethods;

class Student{  
    int rollno;  
    String name;  

    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    
    void displayInformation(){System.out.println(rollno+" "+name);}  
}

class TestStudent{  
    public static void main(String args[]){  
     //Creating objects  
        Student s1=new Student();  
        Student s2=new Student();
        s1.insertRecord(111,"Firat");  
        s2.insertRecord(222,"Cemal");  
        s1.displayInformation();  
        s2.displayInformation();  


    }

}  
