import java.util.Scanner;

public class IgualandoCopas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean run = true;

        while (run) {
            int nCopas = teclado.nextInt();

            if (nCopas == 0) {
                run = false;
            }
            if (nCopas != 0) {
                long copaMax = 0;
                long suma = 0;

                for (int i = 0; i < nCopas; i++) {
                    long copas = teclado.nextLong();
                    suma += copas;
                    if (copas > copaMax) {
                        copaMax = copas;
                    }
                }
                long result = ((copaMax * nCopas) - suma);
                System.out.println(result);
            }
        }
    }
}
