public class Task3 {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCDEE"));
    }
    public static String removeDup(String word){
        String expectedResult="";
        for (int i = 0; i <word.length(); i++) {
            if (!expectedResult.contains(""+word.charAt(i))) {
            expectedResult+=word.charAt(i);
            }
        }
        return expectedResult;
    }
}
