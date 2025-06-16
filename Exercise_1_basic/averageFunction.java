package Exercise_1_basic;

import java.util.Scanner;

public class averageFunction {
    static int average(int a, int b, int c){
        int sum;
        int solution;
        sum = a+b+c;
        solution = sum/3;
        System.out.println("The average number is: "+solution);
        return solution;
        
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the secound number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third number: ");
            int c = sc.nextInt();

            average(a, b, c);
        }
       


    }
}
