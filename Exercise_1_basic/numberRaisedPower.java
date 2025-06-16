package Exercise_1_basic;

import java.util.Scanner;

public class numberRaisedPower {
    static double power(double x,int n){
        return Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the exponent n: ");
        int n= sc.nextInt();
        System.out.println("The output is: " + power(x, n));
    }
}
