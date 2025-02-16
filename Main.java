//package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
    System.out.println("ingrese un número entero por favor");
    int numerosolicitado = scanner.nextInt();
    
    //int resultado = numerosolicitado % numerosolicitado ;
    
        if (numerosolicitado % 2 == 0){
        System.out.println("el número "+ numerosolicitado +" ingresado " + " es par");
        
    }
    else{
        System.out.println("el número "+ numerosolicitado + " ingresado " +" es impar");          
    }

   

    }

}
