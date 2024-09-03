package RomanToInteger_13;

import java.util.HashMap;
import java.util.Map;

public class FastSolution_Hash {
    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> romanMap = new HashMap<>();

            //Mapear caracteres:
            romanMap.put('I',1);
            romanMap.put('V',5);
            romanMap.put('X',10);
            romanMap.put('L',50);
            romanMap.put('C',100);
            romanMap.put('D',500);
            romanMap.put('M',1000);

            int sum = 0, prevValue = 0;

            for(int i =0; i<s.length();i++){
                //valor do caractere romano
                int currentValue = romanMap.get(s.charAt(i));

                if(currentValue>prevValue){
                    sum += currentValue - 2*prevValue;
                } else{
                    sum += currentValue;
                }

                prevValue = currentValue;
            }
            return sum;
        }
    }

}
