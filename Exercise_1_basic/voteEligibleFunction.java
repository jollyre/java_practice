package Exercise_1_basic;


import java.util.Scanner;

public class voteEligibleFunction {
    
    static int vote(int age){
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for vote");
        }

        return age;
    }
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println(vote(age));


        
    }
}
