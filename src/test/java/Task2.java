import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc","cba"));
    }
    public static boolean sameLetters(String a,String b){
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        String a2="";
        String b2="";
        for(char eachLetters:a1){
             a2+=eachLetters;
        }
        for(char eachLetters:b1){
            b2+=eachLetters;
        }
        return a2.equals(b2);
    }
}
