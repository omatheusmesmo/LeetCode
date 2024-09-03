package RomanToInteger_13;

public class FasterSolution {
    class Solution {
        public int romanToInt(String s) {
            // Mapeia cada caractere romano para seu valor inteiro correspondente
            int[] romanMap = new int[26];
            romanMap['I' - 'A'] = 1;
            romanMap['V' - 'A'] = 5;
            romanMap['X' - 'A'] = 10;
            romanMap['L' - 'A'] = 50;
            romanMap['C' - 'A'] = 100;
            romanMap['D' - 'A'] = 500;
            romanMap['M' - 'A'] = 1000;
            System.out.println(romanMap[8]);
            // Inicializa a soma total
            int sum = 0;
            // Inicializa a variável para armazenar o valor do caractere anterior
            int prevValue = 0;

            // Percorre cada caractere da string
            for (int i = 0; i < s.length(); i++) {
                // Obtém o valor inteiro do caractere romano atual
                int currentValue = romanMap[s.charAt(i) - 'A'];

                // Se o valor atual for maior que o valor anterior, subtrai duas vezes o valor anterior da soma
                if (currentValue > prevValue) {
                    sum += currentValue - 2 * prevValue;
                } else {
                    // Caso contrário, adiciona o valor atual à soma
                    sum += currentValue;
                }

                // Atualiza o valor anterior para o próximo caractere
                prevValue = currentValue;
            }

            // Retorna a soma total
            return sum;
        }
    }

}
