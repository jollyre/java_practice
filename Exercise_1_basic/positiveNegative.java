package Exercise_1_basic;

import java.util.Scanner;

public class positiveNegative {
    
    static int number(int num){

            if(num>0){
            System.out.println("The number is positive " + num);
        } else if(num<0){
            System.out.println("The number is negative " + num);
        } else{
            System.out.println("The number is zero");
        }
        return num;
    }

    public static void main(String[] args) {
      while (true) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        number(num);
      }
        
    }
}
