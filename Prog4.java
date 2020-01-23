import java.util.Scanner;

public class Prog4{

public static void main(String args[]){

    float num1= 12;
    float num2= 8;

    int num3=21;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();
  

    System.out.println("Welcome " + name +" Age " + num3 + " salary a day " + (num1*num2));
}

}