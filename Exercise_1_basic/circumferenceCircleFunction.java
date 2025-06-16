package Exercise_1_basic;

import java.util.Scanner;

public class circumferenceCircleFunction {
    //Write a function that takes in the radius as input and returns the circumference of a circle.
    //note that u can do in any method, i am doing in function method 

    static double radius(int r){
       return  (2* Math.PI * r);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius number: ");
            int r = sc.nextInt();
            double circumference = radius(r);
            System.out.println("The radius of circle with radius " + r + " is " + circumference );
    }
    
}
