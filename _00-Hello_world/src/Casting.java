public class Casting {
    public static void main(String[] args) {
    /*
        CONVERSIONES ENTRE TIPOS

        ++NO PERDEMOS INFORMACIÓN++
            De char ---> int.
            De byte ---> short ---> int ---> long
            De int ---> double
            De float ---> double
        ++PERDEMOS INFORMACIÓN++
            De int ---> float
            De long ---> float
            De long ---> double
     */

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        int monthlyDogsEstimated = (int) monthlyDogs;
        System.out.println(monthlyDogsEstimated);

        // conversión explicita.
        String test = "350";
        System.out.println(Integer.valueOf(test));

        char n = '9';
        int nI = n;
        System.out.println(nI);
    }
}
