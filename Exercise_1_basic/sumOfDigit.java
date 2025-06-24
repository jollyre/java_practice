package Exercise_1_basic;

public class sumOfDigit {
    public static void main(String[] args) {
        int number =1234, sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digit: " + sum);
    }
}
