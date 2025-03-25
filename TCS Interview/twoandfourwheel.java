import java.util.*;

public class twoandfourwheel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ve=sc.nextInt();
        int wh=sc.nextInt();
        if(wh<2*ve || wh%2 !=0 || wh>4*ve)
            System.out.println("Invalid");
        int four=(wh-2*ve)/2;
        int two=ve-four;
        System.out.println("Two Wheeler: "+two);
        System.out.println("Four Wheeler: "+four);
    }
}
