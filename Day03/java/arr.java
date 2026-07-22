package Day03.java;

import java.util.Arrays;
import java.time.*;

public class arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = -2;
        arr[3] = 13;
        arr[4] = 31;

        //Arrays.sort(arr);

        for(int a:arr){
            System.out.println(a);
        }


        //Date d = new Date();
        //d.after

        LocalDate today = LocalDate.now();
        
        LocalDate futureDate = today.plusDays(5);
        futureDate.format(DateFormatter.ofPattern);
    }
}
