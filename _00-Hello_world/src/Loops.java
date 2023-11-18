import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // do while: Ejecuta y después evalua
        int opcion = 0;

        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1: Peliculas");
            System.out.println("2: Series");
            System.out.println("0: Salir");

            Scanner sc =new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Usted ha seleccionando peliculas. ");
                    break;
                case 2:
                    System.out.println("Usted ha seleccionado Series. ");
                    break;
                case 0:
                    System.out.println("Usted ha salido del programa. ");
                    break;
                default:
                    System.out.println("Eliga una opcion valida");

            }

        } while (opcion != 0);
    }
}
