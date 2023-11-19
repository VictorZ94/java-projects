import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Objects;

public class ToHexa {
    public static void main(String[] args) {
        System.out.println(decimal_to_hexadecimal(95));
        System.out.println(decimal_to_hexadecimal(459));
    }

    /**
     * Method to convert a decimal number in hexadecimal number
     * @param num Decimal number to be converted in hexadecimal number
     * @return hexadecimal number
     *
     * @author Victor Zuluaga
     */
    public static String decimal_to_hexadecimal(int num) {

        Dictionary hex_sign = new Hashtable();
        String str_hex_num = "";

        // put method
        hex_sign.put(10, "A");
        hex_sign.put(11, "B");
        hex_sign.put(12, "C");
        hex_sign.put(13, "D");
        hex_sign.put(14, "E");
        hex_sign.put(15, "F");

        while (num > 0) {
            int hex_num = num % 16;
            if (hex_sign.get(hex_num) == null)
                str_hex_num += String.valueOf(hex_num);
            else
                str_hex_num += hex_sign.get(hex_num);
            num /= 16;
        }

        return "0x" + reverse_string(str_hex_num);
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
