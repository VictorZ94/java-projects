import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // do while: Ejecuta y después evalua
//        int opcion = 0;
//
//        do {
//            System.out.println("Seleccione una opcion");
//            System.out.println("1: Peliculas");
//            System.out.println("2: Series");
//            System.out.println("0: Salir");
//
//            Scanner sc =new Scanner(System.in);
//            opcion = sc.nextInt();
//
//            switch (opcion){
//                case 1:
//                    System.out.println("Usted ha seleccionando peliculas. ");
//                    break;
//                case 2:
//                    System.out.println("Usted ha seleccionado Series. ");
//                    break;
//                case 0:
//                    System.out.println("Usted ha salido del programa. ");
//                    break;
//                default:
//                    System.out.println("Eliga una opcion valida");
//
//            }
//
//        } while (opcion != 0);

        short numx = 0;
        // while
        while (numx < 10){
            System.out.print(numx++);
        }
        System.out.println();
        numx = 0;
        do {
            System.out.print(numx++);
        } while (numx < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
