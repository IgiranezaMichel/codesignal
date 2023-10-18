import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
