package Array;

public class maxMinimumArray {
    public static void main(String[] args) {
        
        int[] arr = {2, 8, 1, 4, 6};
        int max = arr[0];
        int min = arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                
            } else if(arr[i]<min) {
                min = arr[i];
             
            }
        }
        System.out.println("The Maximum number is: "+max);
        System.out.println("The Minimum number is: "+min);
    }
}
