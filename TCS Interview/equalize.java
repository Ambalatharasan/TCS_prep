/*You have to get three user input P,Q and R. Select any two integer and can increase its value by 1 and decrease by 1, have to print if all three integer values are equal or not, if all values are equal then print -1, or else print the minimum number of steps required to equalize all three input values. 
Ex: 
Input: 10 6 9 
Output: 4  */

import java.util.*;

public class equalize {
    static int stepequalizer(int p,int q,int r){
        if(p==q && q==r)
            return -1;
        int[] n={p, q, r};
        Arrays.sort(n);
        int min=(n[1]-n[0]) + (n[2]-n[0]);
        int mid=(n[1]-n[0]) + (n[2]-n[1]);
        int max=(n[2]-n[1]) + (n[2]-n[0]);
        return Math.min(min, Math.min(mid,max));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(stepequalizer(p, q, r));
    }
}

