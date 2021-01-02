import java.util.Scanner;

public class DuracionDeBombillasLED {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nCasos = teclado.nextInt();

        for (int i = 0; i < nCasos; i++) {
            int horasMax = teclado.nextInt();
            int usosMax = teclado.nextInt();
            int horasPorUso = teclado.nextInt();

            int resp = usosMax * horasPorUso;

            if (resp > horasMax) {
                System.out.println("HORAS");
            }
            if (resp < horasMax) {
                System.out.println("ENCENDIDOS");
            }
            if (resp == horasMax) {
                System.out.println("AMBAS");
            }
        }
    }

}
