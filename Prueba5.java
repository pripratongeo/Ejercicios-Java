import java.util.Scanner;

public class Prueba5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número por favor");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese otro número por favor");
        int numero2 = scanner.nextInt();
        System.out.println("ingrese otro número por favor");
        int numero3 = scanner.nextInt();

        
        if (numero1 >= numero2 && numero1 > numero3) {
            System.out.println("el número "+ numero1+ " es mayor que los números "+ numero2 + " y "+numero3 );

            
        } 
        
            else if (numero2 > numero1 && numero2 > numero3 )
            {
                System.out.println("el número "+ numero2+ " es mayor que los números "+ numero1 + " y "+numero3 );
            }


        
        
            else if (numero3 > numero1 && numero3 > numero2 )
        {
            System.out.println("el número "+ numero3+ " es mayor que los números"+ numero2+ " y "+ numero1);
        }
            else if (numero3 == numero1 && numero3 == numero2)
        {
            System.out.println(" los números indicados son iguales ");
        }
      
        else if (numero1 == numero2 && numero1 == numero3)
        {
            System.out.println(" los números indicados son iguales ");
        }
        
        else if (numero2 == numero1 && numero2 == numero3)
        {
            System.out.println(" los números indicados son iguales ");
        }
        
    

    }

}