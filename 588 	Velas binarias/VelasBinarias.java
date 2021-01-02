
import java.util.Scanner;

public class VelasBinarias {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean run = true;

        while (run) {
            long numero = teclado.nextLong();
            if (numero == 0) {
                run = false;
            }

            if (numero != 0) {
                String binario = "";
                while (numero > 0) {
                    if (numero % 2 == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = "1" + binario;
                    }
                    numero = numero / 2;
                }

                String binario2 = binario.replace("0", " ").trim().replace(" ", "0");

                int fin = binario2.length() - 1;
                int ini = 0;
                boolean espalin = true;

                while (ini < fin) {
                    if (binario2.charAt(ini) != binario2.charAt(fin)) {
                        espalin = false;
                    }
                    ini++;
                    fin--;
                }
                if (espalin) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }

            }

        }

    }

}
