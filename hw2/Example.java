public class Example{

public static void main(String args[]){

    Student s1= new Student("Efren",29,7);
    Student s2= new Student("Efren jr",20,7);
    Student s3= new Student("Jr",19,6);
    User u1 = new User("Andres",34);
    Animal a1 = new Animal("machiato", "dog");
    Animal a2 = new Animal("baby","shark");
    Animal a3 = new Animal("chito", "rat");
    Animal a4 = new Animal("capi", "cat");
    s1.studentDisplay();
    System.out.println(u1.name);
    System.out.println(a1.name);
    

    a3.attack(s3);
    a4.attack(s2);
    
    

}

}