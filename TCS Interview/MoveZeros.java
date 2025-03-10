import java.util.*;

public class MoveZeros {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;
            }
        }
        for(int i=index;i<n;i++)
            a[i]=0;
        for(int b:a)
            System.out.print(b+" ");
    }
}