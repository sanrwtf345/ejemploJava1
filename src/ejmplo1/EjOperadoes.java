package ejmplo1;

public class EjOperadoes {

    public static void main(String[] args) {

        double precio;
        int cantidad;
        double total;
        byte unidades;

        //operaror de asignacion
        precio=6542.55;
        cantidad=5;

        total=precio*cantidad;//operador de asignacion y multiplicacion
        System.out.println("El total es" + total);

        precio=7852.55;
        cantidad=256;

        //total=total + (precio*cantidad);
        total += (precio*cantidad);

        System.out.println("El total es" + total);

        cantidad++;
        System.out.println(cantidad);



    }

}
