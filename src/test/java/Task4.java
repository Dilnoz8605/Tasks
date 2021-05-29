public class Task4 {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBBCCDEF"));
    }
    public static String unique(String word){
        String result="";
        String letters="";
        for (int i = 0; i < word.length(); i++) {
            if(!letters.contains(""+word.charAt(i))){
                letters+=word.charAt(i);
            }
        }
        for (int j = 0; j < letters.length(); j++) {
            int count=0;
            for (int i = 0; i < word.length(); i++) {
                if(letters.charAt(j)==word.charAt(i)){
                    count+=1;
                }
            }
            if(count==1){
                result+=letters.charAt(j);
            }
        }
        return result;
    }
}
