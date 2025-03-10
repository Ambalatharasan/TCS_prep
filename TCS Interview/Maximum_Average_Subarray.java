import java.util.*;

public class Maximum_Average_Subarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        int left=0,right=k,sum=0;
        for(int i=0;i<k;i++)
            sum+=a[i];
        double max=sum;
        while(right<n){
            sum=sum-a[left]+a[right];
            left++;
            right++;
            if(sum>max)
                max=sum;
        }
        System.out.printf("%.5f",max/k);
    }
}