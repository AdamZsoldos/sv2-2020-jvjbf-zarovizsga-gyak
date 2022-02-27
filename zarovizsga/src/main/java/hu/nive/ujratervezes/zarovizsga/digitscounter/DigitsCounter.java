package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.Set;
import java.util.TreeSet;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null) {
            return 0;
        }
        Set<Character> digits = new TreeSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            }
        }
        return digits.size();
    }
}
