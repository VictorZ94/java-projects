public class OpLogicos {
    public static void main(String[] args) {
        int a=8, b=5;
        /*//Operadores de Igualdad
        System.out.println("¿Es a igual que b? -----------> "+(a==b));
        System.out.println("¿Es a diferente que b? -------> "+(a!=b));
        //Operadores de Comparacion
        System.out.println("¿Es a mayor que b? -----------> "+(a>b));
        System.out.println("¿Es a menor que b? -----------> "+(a<b));
        System.out.println("¿Es a mayor igual que b? -----> "+(a>=b));
        System.out.println("¿Es a menor igual que b? -----> "+(a<=b));
        */
        if(a == b){
            System.out.println("La variable *a* es igual a la variable *b*.");
        } else if (a!=b) {
            System.out.println("La variable *a* es distinta a la variable *b*.");
        }else if (a>b){
            System.out.println("La variable *a* es mayor a la variable *b*.");
        }else if(a<b){
            System.out.println("La variable *a* es menor a la variable *b*.");
        }else if(a>=b){
            System.out.println("La variable *a* es mayor e igual a la variable *b*.");
        }else if(a<=b){
            System.out.println("La variable *a* es menor e igual a la variable *b*.");
        }
    }
}
