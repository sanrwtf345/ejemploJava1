package ejmplo1;

import java.util.Scanner;

public class EjemploCondicionales {
    public static void main(String[] args) {
        //psvm para crear public static void main

        byte stockProducto1;
        double precioProducto1;

        byte stockProducto2;
        double precioProcuto2;

        stockProducto1=5;
        stockProducto2=24;

        precioProducto1=6548;
        precioProcuto2=80000;

        //condicionales

        if (stockProducto1 <= 5){
            System.out.println("Debe comprar el producto 1, esta llegando al minimo");
        }//fin del if
        else {
            System.out.println("No es necesario comprar el producto");
        }//fin del else

        //condicional con multiples condiciones

        if (stockProducto2 > 500 && precioProcuto2 > 8000){
            System.out.println("stock excesivo y precio muy alto");
        }

        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese el stock del producto 1");
        stockProducto1= sc.nextByte();



    }//fin del main
}//fin de la clase
