package Exercise_1_basic;

import java.util.Scanner;

public class numberRaisedWithoutPow {

    static double base(double x,int n){
        int result = 1;
        for(int i=1; i<=n;i++){
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        System.out.println("The Output of the given number is: " + base(x, n));
    }
}
