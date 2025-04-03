package ejmplo1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declarar dos variables
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        // Se muestra las opciones al usuario
        System.out.println("Seleccione 1 para sumar o seleccione 2 para restar");
        int opcionOpercacion= scanner.nextInt();

        //Se utiliza el condicional "if" para saber que opcion eligio
        if (opcionOpercacion == 1){
            resultado = num1+num2;
            System.out.println("El resultado es: "+resultado);

        }
        else {
            if (opcionOpercacion == 2){
                resultado = num1-num2;
                System.out.println("El resultado es: "+resultado);
            }
        }




    }
}
