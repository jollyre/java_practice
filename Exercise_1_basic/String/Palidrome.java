package Exercise_1_basic.String;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word to check it is palidrome: ");
        String str = sc.nextLine();
        
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println(str + " is a palindrome");
        } else{
            System.out.println(str + " is not a palindrone");
        }
    }
}
