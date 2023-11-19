import java.util.Objects;

public class ToOctal {
    public static void main(String[] args) {
        System.out.println(decimal_to_octal(95));
        System.out.println(decimal_to_octal(532));
        System.out.println(decimal_to_octal(200));
        System.out.println(decimal_to_octal(659));
        System.out.println(decimal_to_octal(457));
        System.out.println(decimal_to_octal(120));
    }

    /**
     * Method to convert a decimal number in octal number
     * @param num Decimal number to be converted in octal number
     * @return Octal number
     *
     * @author Victor Zuluaga
     */
    public static String decimal_to_octal(int num) {
        String str_num = "";

        while (num > 0) {
            str_num += String.valueOf(num % 8);
            num /= 8;
        }

        return "0o" + reverse_string(str_num);
    }

    /**
     * Function to reverse a String
     * @param str String to be reversed
     * @return String reversed
     *
     * @author Victor Zuluaga
     */
    public static String reverse_string(String str) {
        if (Objects.equals(str, ""))
            return "";

        String reversed_string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed_string += str.charAt(i);
        }

        return reversed_string;
    }
}
