package Exercise_1_basic;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Selling price: ");
        int sp = sc.nextInt();
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();
        
        System.out.println(sp -cp);
       
    }
}
