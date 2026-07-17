package java02;

public class primeto50 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=2;i<50;i++){
            boolean isPrime = true;
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
                count+=1;
            }
        }
        System.out.println("Count of prime numbers between 1 and 50 is "+count);

    }
}
