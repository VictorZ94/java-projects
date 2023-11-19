import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // new para usar objetos en Java
        String[] days = new String[7];

        System.out.print("[");
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        for (int i = 0; i < days.length; i++) {

            System.out.print(days[i]);
            if (i < days.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        int[] array_int = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int elm : array_int)
            System.out.print(elm + " ");

        System.out.println();
        int x = 1; while (x <= 10) System.out.println(++x);

//        List<String> Days = new ArrayList<>();
//
//        Days.add("Monday");
//
//        Days.add("Tuesday");
//        Days.add("10");
//
//        Days.forEach((n) -> System.out.println(n));

    }
}
