package RomanToInteger_13;

public class WorseSolution {
    class Solution {
        public int romanToInt(String s) {
            int[] integers = {1, 5, 10, 50, 100, 500, 1000};
            char[] romans = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
            char[] arrayS = s.toCharArray();
            int sum = 0;
            int temp = 0;

            for (int i = 0; i < arrayS.length; i++) {
                for (int j = romans.length - 1; j >= 0; j--) {
                    System.out.println("Soma total: " + sum);
                    System.out.println(arrayS[i] + " " + romans[j]);
                    if (i >= 0 && arrayS[i] == romans[j] && (integers[j]/5 == temp || integers[j]/10 == temp || integers[j]/5 == temp/2 )){
                        sum -= temp;
                        System.out.println("sub IF" + sum);
                    } if (arrayS[i] == romans[j]) {
                        sum += integers[j];
                        temp = integers[j]*2;
                        System.out.println("Soma else: ");
                    }
                }
            }
            return sum;
        }
    }

}
