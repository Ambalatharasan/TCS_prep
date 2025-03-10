import java.util.*;

public class Sortevenodd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]%2 == 0)
                a[i]*=-1;
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]%2 == 0)
                a[i]*=-1;
        }
        for(int b:a)
            System.out.print(b+" ");
    }
}