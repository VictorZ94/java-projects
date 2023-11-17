
public class Variables {
    public static void main(String[] args) {
        byte number1 = 20; //8 bits -> range: -128 to 127
        short number2 = 32767; //16 bits -> range: -32,768 to 32,767
        int number3 = 2147483647; //32 bits -> range: -2,147,483,648 a 2,147,483,647.
        long number4 = 9223372036854775807L; //64 bits -> range: -9,223,372,036,854,775,808L to 9,223,372,036,854,775,807L.
        float number5 = 12345.67f; //32 bits -> decimals
        double number6 = 12345.67f; //64 bits -> Greater precision
        char symbol = 'S';
        boolean isLike = true;

        System.out.println("byte -> " + number1);
        System.out.println("short -> " + number2);
        System.out.println("int -> " + number3);
        System.out.println("long -> " + number4);
        System.out.println("float -> " + number5);
        System.out.println("double -> " + number6);
        System.out.println("char -> " + symbol);
        System.out.println("boolean -> " + isLike);
    }
}
