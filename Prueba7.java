import java.util.Scanner;


public class Prueba7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba por favor la temperatura del agua actual");
        int temperatura = scanner.nextInt();


        
        if (temperatura >= 100)
        {
            System.out.println("el estado del agua actualmente es gaseoso");
        }

        
        
            else if (temperatura < 100 && temperatura  >= 0){
                System.out.println("el estado del agua actualmente es liquido");
            }
            
        else if ( temperatura < 0)
        {
            System.out.println("el estado del agua actualmente es solido");
        }

        


    






    }
    
}
