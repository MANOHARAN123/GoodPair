import java.util.Scanner;

class GoodPairs{
    public int Solution(int[] arr , int b){
        int arrLength = arr.length;
        int i=0;
        int j=arrLength-1;
        int count =0;
        while(i<j){
            if (arr[i]+arr[j] == b){
                count = count+1;
            }
            if(j==i+1)
            {
                i++;
                j=arrLength;
            }
            j--;
        }
        return count;
    }
}
public class GoodPair {
    public static void main(String[] args) {
        GoodPairs A = new GoodPairs();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(A.Solution(arr,c));
       System.out.println(A.Solution(new int[]{1, 2, 3, 4},7));

    }
}