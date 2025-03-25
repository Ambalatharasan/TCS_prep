import java.util.*;

public class VowelFromDigit {

    static String numberToText(int n) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (n == 100)
            return "hundred";
        if (n < 10)
            return ones[n];
        if (n < 20)
            return teens[n - 10];
        return tens[n / 10] + (n % 10 == 0 ? "" : ones[n % 10]);
    }

    static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) 
                count++;
        }
        return count;
    }

    static int findPairs(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int complement = target - num;
            if (freq.containsKey(complement))
                count += freq.get(complement);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) 
            numbers[i] = sc.nextInt();
        int vowelCount = 0;
        for (int num : numbers)
            vowelCount += countVowels(numberToText(num));
        int pairCount = findPairs(numbers, vowelCount);
        String result = numberToText(pairCount);
        System.out.println(pairCount > 100 ? "greater 100" : result);
        sc.close();
    }
}