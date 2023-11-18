import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        String num = input.nextLine();
        System.out.println(Integer.valueOf(num)*3);

        short num2 = input.nextShort();
        System.out.println(num2*3);
    }
}
