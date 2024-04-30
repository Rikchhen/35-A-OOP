/*Write a JAVA program to input any alphabet and check whether it is vowel or consonant*/
public class w3task6 {
    public static void main(String[] args) {
        
        char ch = 'i';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}