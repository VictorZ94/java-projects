import java.util.Scanner;
public class Functions {
    // Documentation
    /*JAVA Docs
      @author: Es el autor de la clase
      {@code}: muestra texto en formato de codigo sin que sea interpretado como HTML
      {@docRoot}: Indica la ruta relativa al directoorio raiz del documento generado desde cualquier pagina generada
      @deprecated: Se pone indicando que esta API no debe usarse mas
      @exception: Se indica cuando es vulnerable a lazar una excepcion, en seguida se ponen las class  de las excepciones posibles
      {@inheritDoc}: Indica la herencia o implementacion procedentadora
      {@link}: hace un enlace a la mienbro indicado
      {@linkplain}: el  etxto se muestra en texto plano xd
      @param: añande parametros con nombres especificos, seguido de su descripcion
      @return: Asigna un parametro de retorno, seguido de su descripcion
      @see: se añade para manejar referencias, o informacion relacionada
      @serial: Se utiliza paar indicar campos o clases seriales
      @serialData: se utiliza para documentar metodos que generan una serializacion
      @serialField: se utiliza para documentar objetos serializados
      @since: se añade en el encabezado para especificar dsde cuando fue creado
      @throws: es sinonimo con la etiqueta @exception
      {@value}: cuando es usado sin argumento se usa para especificar un campo estatico en otro caso se usa para mostar el valor contante
      @version: se añade en el subtitulo con la version especificada
    */

    /**
     * main: enter point
     * @param args: command line args
     * return: Nothing
     * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tú nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("¡Perfecto " + nombre + " hoy vamos a sumar rápido!");
        Scanner a = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        long numero1 = a.nextLong();
        Scanner b = new Scanner(System.in);
        System.out.println("Digita otro numero: ");
        long numero2 = b.nextLong();

        System.out.println(nombre + "el resultado de la suma es: " + suma(numero1,numero2));

        double y = 2.99;
        double c1 = circleArea(y);
        System.out.println(c1);

        System.out.println(sphereArea(y));

        // Volumen de una esfera
        //(4/3)*pi * r3
        sphereVolumen(y);
        System.out.println(sphereVolumen(y));

        System.out.println("Pesos a dolares: " + convertToDolar(1000, "COP"));

    }

    /**
     * Description: function that sum two long values
     * @param numero1 first number
     * @param numero2 second number
     * @return sum both numbers
     */
    public static long suma (long numero1, long numero2){
        return numero1+numero2;
    }

    /**
     * Description: computed area circle
     * @param r
     * @return
     * @author Victor Zuluaga
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Descripcion: Calcula la esfera de un volumen
     * @param r radio
     * @return sphere computed
     */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Calcula la esfera de un volumen
     * @param r: radio
     * @return sphere computed
     */
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity: Cantidad de dinero.
     * @param currency: Tipo de Moneda ingresada. Solo acepta MXN, CORD, HNL.
     * @return quantity Devuelve la cantidad actualizda en Dolares.
     * */
    public static double convertToDolar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity *= 0.049;
                break;
            case "COP":
                quantity *=  0.00023;
                break;
        }

        return quantity;
    }
}
