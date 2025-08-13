// ANALISIS 
/* 
* Descripcion de la calculadora debera pedirle al usuario 2 numeros
* y con esos 2 numeros realizar suma, resta, multiplicacion, division y modulo 
* Entradas: 2, numero 1 y numero 2, ambos ingresados por el usuario
* Salidas 5, una por cada resultado de la operacion aritmetica 
*/
import java.util.Scanner;

public class Calculadora { 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  

        double numero1, numero2;

        System.out.println("por favorcito deme el primero numerito");
        numero1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("el numero que ingresaste es:" + numero1);

        System.out.println("por favorcito deme el segundo numerito");
        numero2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("el numero que ingresaste es:" + numero2);
        
        double suma, resta, multiplicacion, modulo, division;

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        modulo = numero1 % numero2;
        division = numero1 / numero2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la suma es: " + resta);
        System.out.println("El resultado de la suma es: " + multiplicacion);
        System.out.println("El resultado de la suma es: " + modulo);
        System.out.println("El resultado de la suma es: " + division);

     }

     public static double sumar (double a, double b) {
       double suma = a + b;
       return suma; 
     }


    public static double restar(double a, double b) {
        return a - b; 
    
    
    }
}