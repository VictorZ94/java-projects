import java.util.Objects;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println(decimal_to_binary(0));
        System.out.println(decimal_to_binary(1));
        System.out.println(decimal_to_binary(43));
        System.out.println(decimal_to_binary(10));
        System.out.println(decimal_to_binary(32));
        System.out.println(decimal_to_binary(64));
        System.out.println(decimal_to_binary(128));
        System.out.println(decimal_to_binary(185472));
    }

    /**
     * Method to convert a decimal number in binary number
     * @param num Decimal number to be converted in binary number
     * @return Binary number
     *
     * @author Victor Zuluaga
     */
    public static String decimal_to_binary(int num) {
        if (num == 0)
            return "0b";
        if (num == 1)
            return "0b1";

        String str_num = "";

        while(num > 0) {
            str_num += String.valueOf(num % 2);
            num /= 2;
        }

        return "0b" + reverse_string(str_num);
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
