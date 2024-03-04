import java.util.Scanner;

public class EjercicioPalabra {
    public static void main(String[] args) {
        //Impresión de Patrón de Palabra en Horizontal

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toUpperCase(); // Convertir la palabra a mayúsculas

        // Imprimir el patrón de la palabra en horizontal
        System.out.println("Patrón de la palabra '" + palabra + "':\n");
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            imprimirPatron(letra);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para imprimir el patrón de una letra en horizontal
    public static void imprimirPatron(char letra) {
        switch (letra) {
            case 'A':
                System.out.println("  *  ");
                System.out.println(" * * ");
                System.out.println("*   *");
                System.out.println("*****");
                System.out.println("*   *");
                break;
            case 'B':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                break;
            case 'C':
                System.out.println(" ****");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println(" ****");
                break;
            case 'D':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("**** ");
                break;
            case 'E':
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*****");
                break;
            case 'F':
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*****");
                System.out.println("*    ");
                System.out.println("*    ");
                break;
            case 'G':
                System.out.println(" ****");
                System.out.println("*    ");
                System.out.println("*  **");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 'H':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*****");
                System.out.println("*   *");
                System.out.println("*   *");
                break;
            case 'I':
                System.out.println("*****");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("*****");
                break;
            case 'J':
                System.out.println("*****");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("* *  ");
                System.out.println(" **  ");
                break;
            case 'K':
                System.out.println("*   *");
                System.out.println("*  * ");
                System.out.println("**   ");
                System.out.println("*  * ");
                System.out.println("*   *");
                break;
            case 'L':
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*    ");
                System.out.println("*****");
                break;
            case 'M':
                System.out.println("*   *");
                System.out.println("** **");
                System.out.println("* * *");
                System.out.println("*   *");
                System.out.println("*   *");
                break;
            case 'N':
                System.out.println("*   *");
                System.out.println("**  *");
                System.out.println("* * *");
                System.out.println("*  **");
                System.out.println("*   *");
                break;
            case 'O':
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 'P':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*    ");
                System.out.println("*    ");
                break;
            case 'Q':
                System.out.println(" *** ");
                System.out.println("*   *");
                System.out.println("* * *");
                System.out.println("*  **");
                System.out.println(" *** ");
                break;
            case 'R':
                System.out.println("**** ");
                System.out.println("*   *");
                System.out.println("**** ");
                System.out.println("*  * ");
                System.out.println("*   *");
                break;
            case 'S':
                System.out.println(" ****");
                System.out.println("*    ");
                System.out.println(" *** ");
                System.out.println("    *");
                System.out.println("**** ");
                break;
            case 'T':
                System.out.println("*****");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                break;
            case 'U':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" *** ");
                break;
            case 'V':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println(" * * ");
                System.out.println("  *  ");
                break;
            case 'W':
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("* * *");
                System.out.println("** **");
                System.out.println("*   *");
                break;
            case 'X':
                System.out.println("*   *");
                System.out.println(" * * ");
                System.out.println("  *  ");
                System.out.println(" * * ");
                System.out.println("*   *");
                break;
            case 'Y':
                System.out.println("*   *");
                System.out.println(" * * ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                System.out.println("  *  ");
                break;
            case 'Z':
                System.out.println("*****");
                System.out.println("   * ");
                System.out.println("  *  ");
                System.out.println(" *   ");
                System.out.println("*****");
                break;
            default:
                System.out.print("Carácter no reconocido: " + letra);
        }
        // Espacio entre letras
        System.out.print("\n");
    }
}
