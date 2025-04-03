package ejmplo1;

import java.util.Scanner;

public class EjeciciosClase2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declaramos las variables para los tres numeros
        System.out.println("Ingrese el primer numero");
        double primerNum= scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double segundoNum= scanner.nextDouble();

        System.out.println("Ingrese el tercer numero");
        double tercerNum= scanner.nextDouble();

        //comparacion de los tres numeros 
        if (primerNum>segundoNum & primerNum>tercerNum){
            System.out.println("El primer numero "+primerNum+" es el mayor");
        }
        else {
            if (segundoNum>primerNum & segundoNum>tercerNum){
                System.out.println("El segundo numero "+segundoNum+" es el mayor");
            }
            else {
                if (tercerNum>primerNum & tercerNum>segundoNum){
                    System.out.println("El tercer numero "+tercerNum+" es el mayor");
                }
            }
        }

    }
}
