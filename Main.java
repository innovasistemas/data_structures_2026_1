import java.util.Scanner;

import com.packages.arrays.*;
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
                    menuVector();
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
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!resp.equals("0"));
    }


    public static void menuVector()
    {
        String resp;
        int datum, pos;
        Vector v = new Vector();
        
        do {
            System.out.println("\n-------Menú Vectores------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar dato");
            System.out.println("2. Tamaño");
            System.out.println("3. Mostrar");
            System.out.println("4. Buscar (secuencial)");
            System.out.println("5. Modificar");
            System.out.println("6. Eliminar");
            System.out.println("7. Insertar");
            System.out.println("8. Ordenar (burbuja)");
            System.out.print("Ingrese su opción: ");
            resp = input.nextLine();

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato vector: ");
                    datum = input.nextInt();
                    input.nextLine();
                    if (v.getN() < v.getT()) {
                        v.addVector(datum);
                    } else {
                        System.out.println("Vector lleno");
                    }
                    // v.addVector(input.nextInt());
                    break;
                case "2":
                    System.out.println("Tamaño vector: " + v.getN());
                    break;
                case "3":
                    v.showVector();
                    break;
                case "4":
                    if (v.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(datum + " no se encuentra en el vector");
                        } else {
                            System.out.println(datum + " encontrado en posición " + pos);
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "5":
                    if (v.getN() > 0) {
                        System.out.print("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(datum + " no se encuentra en el vector");
                        } else {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            v.updateVector(datum, pos);
                            System.out.println("Dato actualizado correctamente");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "6":
                    if (v.getN() > 0) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(datum + " no se encuentra en el vector");
                        } else {
                            v.deleteVector(pos);
                            System.out.println("Dato eliminado correctamente");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "7":
                    if (v.getN() < v.getT()) {
                        System.out.print("Dato referencia: ");
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(datum + " no se encuentra en el vector");
                        } else {
                            System.out.print("Dato a insertar: ");
                            datum = input.nextInt();
                            input.nextLine();
                            v.insertVector(pos, datum);
                            System.out.println("Dato insertado correctamente");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "8":
                    if (v.getN() > 0) {
                        v.sortBubble();
                        System.out.println("Vector ordenado correctamente");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!resp.equals("0"));
    }
    
}
