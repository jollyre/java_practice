package Exercise_1_basic.String;

public class countVowelConsonants {
    public static void main(String[] args) {
        String str = "Java";
        int vowels = 0, consonants =0;

        str = str.toLowerCase();//Convert uppercase t0 lowercase

        for(char c: str.toCharArray()){
            if (Character.isLetter(c)){
                if("aeious".indexOf(c)!=-1){
                    vowels++;
                } else{
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " +  consonants);

    }
}
