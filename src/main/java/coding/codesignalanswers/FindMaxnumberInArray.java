package coding.codesignalanswers;

public class FindMaxnumberInArray {
   static int solution(int[] inputArray) {
int []arr=new int[inputArray.length-1];
for(int i=0;i<inputArray.length;i++)
{
    if(i<inputArray.length-1)
    {
       arr[i]=inputArray[i]*inputArray[i+1]; 
    }
}
int count=0;
int max=arr[count];
for(int im:arr){
if(max<im){
    max=im;
}
}
return max;
}
public static void main(String[] args) {
    int[] array = new int[]{2,3,400,8,20};
    
    System.out.println("The maximum number in the given array is: "+solution(array));
}
}
