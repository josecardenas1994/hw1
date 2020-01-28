public class Player {
    // attributes
    private String name;
    public int age;
    public String nationality;
    public double salary;

    // methods
    // visibility dataTypeReturn nameMethod(parameters){ code of method }

    public void PrintPlayer(){
        System.out.println("-----------------------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(nationality);
        System.out.println(salary);
        
    }

    // setters and getters
    // visibility dataTypeReturn nameMethod(parameters){ code of method }

    public void setName(String n) {
       
        name = n;

    }
    public String getName(){
        return name;
    }
    // constructor special method to create objects
    // visibility nameMethod
    public Player(String n, int a, String t, double s){
        name=n;
        age=a;
        nationality=t;
        salary=s;
        
    }



}