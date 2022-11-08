import java.util.Scanner;

public class SaludoNombre

{

    public static void main(String arg[]){

        Scanner mi_objeto_scanner = new Scanner(System.in);

        String nombre = null;

        int veces = 0;

        

        System.out.print("Dime tu nombre: ");

        nombre = mi_objeto_scanner.nextLine();

        System.out.print("¿Cuántas veces te saludo? ");

        veces = mi_objeto_scanner.nextInt();

        

        escribirMensajes(veces, "Hola, " + nombre + "!");

        

        

    }

    public static void escribirMensajes(int n_veces, String mensaje){

        for(int i = n_veces; i > 0; i--){

            System.out.println(mensaje);

        }

    }

}
