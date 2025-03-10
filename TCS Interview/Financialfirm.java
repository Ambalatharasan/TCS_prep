import java.util.*;

public class Financialfirm {
    static boolean isMono(int[] a, int n){
        int flag=0;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                if(flag==0)
                    flag=1;
                if(flag==-1)
                    return false;
            }
            else if(a[i]<a[i-1]){
                if(flag==0)
                    flag=-1;
                if(flag==1)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(isMono(a,n));
    }
}