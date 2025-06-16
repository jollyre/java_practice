package Function;

public class function_2 {
    static void m1(){
        System.out.println("this is a static function");  // -> this is a static function
    }
    void m2(){
        System.out.println("This is non static function");// -> this is non static function 
    }
    public static void main(String[] args) {
        m1();
        function_2 ob = new function_2(); // -> created object for non static
        System.out.println("Created object for m2 because it is non static");//
        ob.m2();
    }
}
