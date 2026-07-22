package Day03.java;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Divisor: ");
        int a = sc.nextInt();
        System.out.println("Enter Dividend: ");
        int b = sc.nextInt();

        try{
            System.out.println("Quotient is "+(a/b));
        }
        catch(Exception e){
            System.out.println("Invalid dividend");
        }
        finally{
            System.out.println("Exception handling done");
        }

        sc.close();
    }
}

class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
    
    public CustomException(String message, Throwable cause){
        super(message, cause);
    }

}