package Exercise_1_basic;

import java.util.Scanner;

public class oddFunctionSum {
    static int oddfunction(int n,int sum){
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println("The sum of all odd number is: " + n+ " is " +sum);
        return sum ;
    }
    public static void main(String[] args) {
        //calculate sum of odd number from  1 to n

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any number from 1 t0 n for sum odd number: ");
            int n = sc.nextInt();

            int sum = 0;

            oddfunction(n, sum);
        } 
        
    }
}
