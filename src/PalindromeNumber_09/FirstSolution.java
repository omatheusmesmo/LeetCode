package PalindromeNumber_09;

public class FirstSolution {
    public boolean isPalindrome(int x) {

        String value = String.valueOf(x);
        char num;
        String reverseValues="";
        for (int i = 0; i < value.length(); i++){
            num = value.charAt(i);
            reverseValues = num + reverseValues;
        }

        return value.equals(reverseValues);
    }
}
