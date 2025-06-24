package Exercise_1_basic;

import java.util.Scanner;

public class primeNumber {
    
    public static void main(String[] args) {
        //Check Prime Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<=1) isPrime = false;
        for(int i=2; i<= Math.sqrt(num);i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime Number ");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
