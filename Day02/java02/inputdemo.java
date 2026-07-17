package java02;
import java.util.Scanner;

public class inputdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Your name is "+ name);

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected option 1");
                break;
        
            case 2:
                System.out.println("You selected option 2");
                break;
            default:
                System.out.println("You selected default option");
                break;
        }

        int x = 5;
        System.out.println(x++ + " Then " + ++x);
        sc.close();
    }    
}
