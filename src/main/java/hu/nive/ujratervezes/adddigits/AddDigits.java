package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {

        if (input == null || input.isEmpty()) {
            return -1;
        }

        String digits = input.replaceAll("[^0-9]", "");

        return digits.chars().map(it -> it - '0').sum();
    }

}
