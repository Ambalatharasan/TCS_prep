import java.util.*;

public class Maximum_Ascending_Subarray_Sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int sum=a[0];
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1])
                sum+=a[i];
            else
                sum=a[i];
            if(sum>max)
                max=sum;
        }
        System.out.println(max);
    }
}