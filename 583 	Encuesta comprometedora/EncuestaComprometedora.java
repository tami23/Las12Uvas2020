
import java.util.Scanner;

public class EncuestaComprometedora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nCasos = teclado.nextInt();

        for (int i = 0; i < nCasos; i++) {
            long A = teclado.nextInt();
            long B = teclado.nextInt();
            long total = (A + B) / 2;
            A = A - total;

            long respC = ((A * 100) / total);
            System.out.println(respC);
        }

    }

}
