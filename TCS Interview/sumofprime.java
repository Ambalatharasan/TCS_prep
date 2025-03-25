
import java.util.*;

public class sumofprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=2;
        int n2=sc.nextInt();
        int c=0,sum=0;
        for(int n=n1;n<=n2;n++){
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    c++;
            }
            if(c==2)
                sum+=n;
            c=0;
        }
        System.out.println(sum);
    }
}
