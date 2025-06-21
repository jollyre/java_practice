package DSA.Array_Basic_prblm;



public class EvenOdd {
    public static void main(String[] args) {
        
        int number[] = new int[5];
        number[0] = 12;
        number[1] = 22;
        number[2] = 27;
        number[3] = 88;
        number[4] = 77;

        for(int i=0;i<5;i++){
            if(number[i]%2==0){
                System.out.println("Even numbers: "+number[i]);
            } else{
                System.out.println("Odd Numbers: "+number[i]);
            }
        }

    }
}
