
import java.util.*;

public class candidateskill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String[] arr = new String[n];
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            hm.put(arr[i], i);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b.length(), a.length()));
        for (int i = 0; i < n; i++) {
            int len1 = str.length();
            str = str.replace(arr[i], "");
            int len2 = str.length();
            if (len1 != len2) {
                System.out.print(hm.get(arr[i]));
            }
        }
    }
}
