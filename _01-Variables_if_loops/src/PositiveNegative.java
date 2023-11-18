public class PositiveNegative {
    public static void main(String[] args) {
        int min = -10000000;
        int max = 10000000;

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        if (random_int > 0) {
            System.out.println(random_int + " is positive");
        } else if (random_int == 0) {
            System.out.println(random_int + " is zero" );
        } else {
            System.out.println(random_int + " is negative");
        }
    }
}
