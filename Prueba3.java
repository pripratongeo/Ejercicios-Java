import java.util.Scanner;

public class Prueba3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número por favor");
        int numerosolicitado = scanner.nextInt();

        if (numerosolicitado >= 0) {
            System.out.println("ingrese otro número por favor");
            int numerosolicitado2 = scanner.nextInt();
            int suma = numerosolicitado + numerosolicitado2;
            int resta = numerosolicitado - numerosolicitado2;
            int producto = numerosolicitado * numerosolicitado2;

            System.out.println("el resultado de la suma sería " + suma + " la resta sería " + resta
                    + " y el producto sería " + producto);

        } else {
            System.out.println("el número " + numerosolicitado + " ingresado " + " es negativo");
        }

    }

}
