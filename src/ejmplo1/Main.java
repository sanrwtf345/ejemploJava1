package ejmplo1;

public class Main {
    public static void main(String[] args) {

        //variables
        //tipo de dato nombreVariable=valor;

        byte edad = 30;
        short stock = 230;
        double precio = 10.5;

        //imprimir en consola
        System.out.println("La edad es: "+ edad);
        System.out.println("El stock es: "+ stock);
        System.out.println("El precio es: "+ precio);

        String nombreDelProducto = "Notebook HP";
        System.out.println("El nombre del producto es: " + nombreDelProducto);

        boolean estaDisponible=true;
       //Esto es una constante
       final byte NRO_ISP = 63;

        System.out.println("El numero del ISP es " + NRO_ISP);

        //Los float y double son decimales y necesitan llevar una f al final
        float nroDecimalLargo = 00000555569.5599f;
        //salto de linea
        System.out.println("Esta es la primera linea \nEsta es la segunda linea");

        String texto="Este es un segundo texto de tres lineas\nlinea1\nlinea 2\nlinea3";

        System.out.println(texto);



    }
}