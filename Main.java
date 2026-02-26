import java.util.Scanner;
import com.packages.strings.*;

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
                    menuString();
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

    public static void menuString()
    {
        String resp;
        StringChar str = new StringChar();
        do {
            System.out.println("Menú Cadenas de Caracteres");
            System.out.println("0. Regresar");
            System.out.println("1. Ingresar texto");
            System.out.println("2. Mostrar texto");
            System.out.println("3. Longitud texto");
            System.out.println("4. Texto mayúscula");
            System.out.println("5. Texto minúscula");
            System.out.println("6. Palíndromo");
            System.out.println("7. Ejemplos cadenas");
            System.out.println("8. Contar carácter del usuario");
            System.out.print("Ingrese su opción: ");
            resp = input.nextLine();

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print("Ingrese un texto: ");
                    str.setText(input.nextLine());
                    break;
                case "2":
                    System.out.println("Texto ingresado: " + str.getText());
                    break;
                case "3":
                    System.out.println("Longitud texto: " + str.lengthString());
                    break;
                case "4":
                    System.out.println("Texto en mayúscula: " + str.upperString());
                    break;
                case "5":
                    System.out.println("Texto en minúscula: " + str.lowerString());
                    break;
                case "6":
                    str.palindrome();
                    break;
                case "7":
                    ExampleStrings es = new ExampleStrings();
                    break;
                case "8":
                    char charUser;
                    System.out.println("Carácter a contar: ");
                    charUser = input.next().charAt(0);
                    input.nextLine();
                    System.out.println("El carácter " + charUser + " se encuentra " + str.countChar(charUser));
                    break;
                default:
                    System.out.println("Hasta pronto");
                    break;
            }
        } while (!resp.equals("0"));
    }
    
}
