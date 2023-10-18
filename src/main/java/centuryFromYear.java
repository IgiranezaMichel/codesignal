public class centuryFromYear {
  private static  int solution(int year) {
        if(year%100==0)
        {
          return year/100;  
        }
        else{
            return (int)((year/100)+1);
        }
        }
    public static void main(String[] args) {
        int year=1905;
        System.out.print("You're in "+solution(year)+"Century");
    }
}
