/*print the non repeated element in the given array
input: 5
6 2 3 2 5 3
Output: 6 5
 */

import java.util.*;

public class nonrepeat {
    static void find(int[] a,int n){
        for(int i=0;i<n;i++){
            boolean repeat=false;
            for(int j=0;j<n;j++){
                if(a[i]==a[j] && i!=j){
                    repeat=true;
                    break;
                }
            }
            if(!repeat)
                System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        find(a,n);
        }
}
