package java02;

import java.util.Scanner;

public class shiftarray {
    public static int[] rotation(int[] arr, int n){
        int[] n_arr = new int[arr.length];
        int j=0;
        for(int i=n; i<arr.length;i++){
            n_arr[j]=arr[i];
            j++;
        }
        for(int i=0; i<n;i++){
            n_arr[j]=arr[i];
            j++;
        }
        return n_arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input array");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index to be shifted: ");
        int k = sc.nextInt();
        if(k<0 || k>=m){
            System.out.println("The given index value is invalid");
        }
        else{
            int[] n_arr = rotation(arr, k);
            System.out.println("Output array: ");
            for(int i=0;i<n_arr.length;i++){
                System.out.print(n_arr[i]+" ");
            }
        }

        sc.close();
    }

}
