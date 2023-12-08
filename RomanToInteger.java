import java.util.*;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman number: ");
        // Enter input roman numbers 
        String roman = scanner.nextLine().toUpperCase();

        int result = romanToInteger(roman);
        System.out.println("The integer equivalent of the Roman numeral " + roman + " is: " + result);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        //Here Declaration of roman valuse
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValues.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? romanValues.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal) {
                result += (nextVal - currentVal);
                i++;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
}
