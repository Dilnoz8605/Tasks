import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(sort("7654POIUY765"));
    }
    public static String sort(String str) {
        String str2 = "";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if  (Character.isAlphabetic(str.charAt(i))) {
                str2 += str.charAt(i);
            }else if(i==0&&Character.isDigit(str.charAt(i))){
                str2+=str.charAt(i);
            } else if (Character.isDigit(str.charAt(i)) && Character.isAlphabetic(str.charAt(i - 1))) {
                str2 += " ";
                str2 += str.charAt(i);
            }else if(i==str.length()-1&&Character.isDigit(str.charAt(i))){
                str2+=str.charAt(i);
            }else if(Character.isDigit(str.charAt(i)) &&Character.isAlphabetic(str.charAt(i + 1))){
                str2+=str.charAt(i);
                str2+=" ";
                } else if(Character.isDigit(str.charAt(i))){
                str2+=str.charAt(i);
            }
        }
        String group="";
        String[] groups = str2.split(" ");
        for (int i = 0; i < groups.length; i++) {
            group=groups[i];
            char[] group1=group.toCharArray();
            Arrays.sort(group1);
            for(char each:group1){
                result+=each;
            }

        }
        return result;
    }
}
