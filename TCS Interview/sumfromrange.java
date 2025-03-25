import java.util.Scanner;

public class sumfromrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        if(n<0 || m<0 || m>9999 || n>9999 || n>m)
            System.out.println("Invalid Input");
        else{
            for(int i=n;i<=m;i++){
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}