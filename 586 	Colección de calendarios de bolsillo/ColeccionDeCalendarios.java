import java.util.Scanner;

public class ColeccionDeCalendarios {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nCasos = teclado.nextInt();
        for (int i = 0; i < nCasos; i++) {
            int nCalendarios = teclado.nextInt();
            int yearMin = 1990;
            int yearMax = 0;
            Integer[] years = new Integer[nCalendarios];

            for (int j = 0; j < years.length; j++) {
                years[j] = teclado.nextInt();
                if (years[j] > yearMax) {
                    yearMax = years[j];
                }
                if (years[j] < yearMin) {
                    yearMin = years[j];
                }
            }
            
            System.out.println(((yearMax - yearMin) - (years.length - 1)));

        }

    }

}
