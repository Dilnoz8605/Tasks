import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        System.out.println(frequencyOfLetters("AAABBC"));
        //Write a return method that can find the frequency of characters
        //
        //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    }

    public static String frequencyOfLetters(String word) {
        String nonDup = "";
        for (int i = 0; i < word.length(); i++) {
            if(!nonDup.contains(""+word.charAt(i))){
                nonDup+=""+word.charAt(i);
            }
        }
        String expectedResult="";
        for (int j = 0; j < nonDup.length(); j++) {
                int count=0;
            for (int i = 0; i <word.length() ; i++) {
                if(word.charAt(i)==nonDup.charAt(j)){
                    count+=1;
                }
            }
            expectedResult+=nonDup.charAt(j)+""+count;
        }
return expectedResult;
    }
}
