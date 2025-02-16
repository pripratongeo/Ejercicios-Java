import java.util.Scanner;

public class Prueba4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número por favor");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese otro número por favor");
        int numero2 = scanner.nextInt();


        if (numero1 >= numero2) {
           
            System.out.println("el número "+ numero1+ " es mayor que el número "+ numero2 );

        } else {
            System.out.println("el número "+ numero2+ " es mayor que el número "+ numero1 );
        }

    }

}