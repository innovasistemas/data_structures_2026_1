import java.util.Scanner;

public class Main 
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String resp;
        do {
            System.out.println("Menú de opciones");
            System.out.println("0. Salir");
            System.out.println("1. Cadenas de caracteres");
            System.out.println("2. Vectores");
            System.out.print("Ingrese su opción: ");
            resp = input.nextLine();

            switch (resp) {
                case "0":
                    System.out.println("Hasta pronto");
                    break;
                case "1":
                    // System.out.println("Hasta pronto");
                    break;
                case "2":
                    // System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!resp.equals("0"));
    }
    
}
