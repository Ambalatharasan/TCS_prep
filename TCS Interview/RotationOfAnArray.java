import java.util.*;
public class RotationOfAnArray {
    static void rotate(int st, int end, int a[]){
        while(st<end){
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        k=k%n;
        rotate(0,n-1,a);
        rotate(0,k-1,a);
        rotate(k,n-1,a);
        for(int b:a)
            System.out.print(b+" ");
    }
}