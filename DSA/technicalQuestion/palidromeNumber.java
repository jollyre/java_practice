package DSA.technicalQuestion;

public class palidromeNumber {
    public static void main(String[] args) {
     int number = 121;
     int  r = number;
     int reversed = 0;

     while (number!=0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number /10;
     }
     if(r==reversed){
        System.out.println(r + "is a palidrome");
     } else {
        System.out.println(r + "is not a palidrome");
     }
    }
}
