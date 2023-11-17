public class updatingVar {
    public static void  main(String [] args) {
        short salary = 1000;

        //bono
        salary += 200;
        System.out.println(salary);

        //pension
        salary -= 50;
        System.out.println(salary);

        String employeeName = "Victor";
//        employeeName = employeeName + " Zuluaga";
        employeeName += " Zuluaga";
        employeeName =  "Alonso " + employeeName;
        System.out.println(employeeName);

        final int POSITION = 5;
//        POSITION++; error
        System.out.println(POSITION);
    }
}
