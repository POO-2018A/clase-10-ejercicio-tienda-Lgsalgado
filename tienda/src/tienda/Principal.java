package tienda;
import java.util.Scanner;
import java.lang.Integer;
import java.math.BigInteger;

public class Principal {


    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("################### INGRESE LOS DATOS DE LA TIENDA ###################");
        int nProductos=0;
        Tienda tienda= new Tienda();



        System.out.println();
        System.out.println();
        System.out.println("NOMBRE DE LA TIENDA");
        tienda.nombre=scan.nextLine();

        System.out.println("DIRECCION ");
        tienda.direccion=scan.nextLine();

        System.out.println("RUC");
        tienda.ruc=scan.nextLine();

        System.out.println("########## INGRESE INFORMACION DE PRODUCTOS QUE OFRECE ##########");
        System.out.print("Cuantos productos va a ingresar: ");
        nProductos=scan.nextInt();
        Productos[] productos= new Productos[nProductos];
        for(int i = 0; i < productos.length; i++) {
            System.out.println("Datos del producto " + (i+1));
            scan.nextLine();

            System.out.print("Marca: ");
            String marca = scan.nextLine();

            System.out.print("Codigo: ");
            String codigo= scan.nextLine();

            System.out.print("Tipo: ");
            String tipo = scan.nextLine();

            System.out.print("Precio:");
            Double precio=scan.nextDouble();

            productos[i] = new Productos(marca, codigo, tipo,precio);
            System.out.println("");
            System.out.println("");

        }







    }


}
