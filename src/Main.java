import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanear = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Inserte su nombre");
        String nombre = scanear.nextLine();
        System.out.println(" ");

        System.out.println("Inserte su apellido");
        String apellido = scanear.nextLine();
        System.out.println(" ");

        System.out.println("Inserte su edad");
        String edad = scanear.nextLine();
        System.out.println(" ");

        System.out.println("Inserte su nacionalidad");
        String nacionalidad = scanear.nextLine();
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su nacionalidad es: " + nacionalidad);


    }


}