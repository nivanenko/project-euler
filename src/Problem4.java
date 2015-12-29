import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Answer: " + findLargestPalindromeInRange(100, 999));
    }

    static int findLargestPalindromeInRange(int a, int b) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = a; i < b; i++) {
            for (int j = a; j < b; j++) {
                if (isPalindrome(i * j)) {
                    listA.add(i);
                    listB.add(j);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) * listB.get(i) > max) {
                max = listA.get(i) * listB.get(i);
            }
        }
        return max;
    }

    static boolean isPalindrome(int i) {
        String a, b;
        a = Integer.toString(i);
        b = new StringBuilder(a).reverse().toString();
        return a.equals(b);
    }
}