package java02;
import java.util.Scanner;

public class numberqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum=0,min=0,max=0;
        float avg = 0;
        System.out.println("Enter numbers for array: ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            sum+=nums[i];
        }
        avg = (float)sum/5;
        min=nums[0];
        max=nums[0];
        for(int i=1;i<5;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);

        sc.close();
    }
}
