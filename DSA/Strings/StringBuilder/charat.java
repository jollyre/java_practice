package DSA.Strings.StringBuilder;

public class charat {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Diksha");

        System.out.println(str.charAt(2)); // show the 2 index

        str.setCharAt(0, 'R'); // set the char 
        System.out.println(str); 

        str.insert(0, 'M'); //insert the char 
        System.out.println(str);

        str.delete(3, 5);
        System.out.println(str);  
    }
}
