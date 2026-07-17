package java02;

import java.util.Scanner;
import java.util.Arrays;

public class anagram {

    public static boolean test(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] Arr1 = a.toCharArray();
        char[] Arr2 = b.toCharArray();
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        return Arrays.equals(Arr1,Arr2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(test(s1,s2));

        sc.close();

    }
}
