public class Parindrome {
    static boolean isParindrome(String inputString) {
        char[] input=inputString.toCharArray();
        String data="";
        for(int i=input.length-1;i>=0;i--){
            data+=input[i];
        }
        return(inputString.equals(data));
        }
   public static void main(String[] args) {
    String str = "aabaa";  // your string here
     isParindrome(str);
   } 
}
