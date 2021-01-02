import java.util.Scanner;

public class GorrosDeColores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nCasos = teclado.nextInt();
        for (int i = 0; i < nCasos; i++) {
            String cad = teclado.next();
            int minutos = 0;
            int ultimo = cad.length() - 1;
            for (int j = ultimo; j > 0; j -= 2) {
                char letra1 = cad.charAt(j);
                char letra2 = cad.charAt(j - 1);
                if (letra1 == letra2) {
                    minutos++;
                }
                minutos++;
            }
            System.out.println(minutos);
        }

    }

}
