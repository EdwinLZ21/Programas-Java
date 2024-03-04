import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticasEnJava {
    public static void main(String[] args) {

        System.out.println("Hola mundo"); // Imprime con salto de línea
        System.out.print("Imprimir sin salto de linea ");
        System.out.println(50000); // Podemos imprimir numeros
        System.out.println(3 * 4); // Podemos hacer calculos matematico
        System.out.println(5 + 6);

        //*****VARIABLES******
        System.out.println("*****VARIABLES******\n");
        int w = -1, x = 5, y = 10, z = 20; //Declaramos "Creamos" valores de tipo entero
        String txt = "¡Hola como están!"; //Declaramos asignamos un valor de tipo String

        System.out.println(++x); //Incrementa el valor en 1

        System.out.println(txt.toUpperCase()); //Convertir el valor de txt a mayúsculas
        System.out.println(txt.toLowerCase()); //Convertir el valor de txt a minuscula

        String firstName = "Edwin ";
        String lastName = "Lopez";
        System.out.println(firstName.concat(lastName)); //Concatena dos cadenas

        System.out.println(txt.indexOf("s")); //Retorna el index (posición) de la primera aparición de "s" en la siguiente cadena

        System.out.println("El numero maximo es: " + Math.max(x, y)); //Encontrar el valor más alto de x e y.

        System.out.println("La raiz cuadrada es: " + Math.sqrt(y)); //Ahora encuentra la raiz cuadrada

        System.out.println("Número random decimal: " + Math.random()); //Devolver un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo).

        System.out.println("El numero random es: " + (int) (Math.random() * 101)); //Devolver un número aleatorio entre 0 y 100.
        System.out.println("El numero random redondeado es: " + Math.floor(Math.random() * 101));

        System.out.println(y > x); //Devuelve un valor true o false

        System.out.println(Math.abs(w)); //El método Math.abs(x) devuelve el valor absoluto (positivo) de x:


        //******  IF y ELSE
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Abreviar un if
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        //*****  SWITCH *****
        int valor = 1;
        switch (valor) {
            case 1:
                // code block
                break;
            case 2:
                // code block
                break;
            default:
                // code block
        }
        //Ejemplo de switch
        System.out.println("\n***Ruleta ganadora***");
        int valorRandom = (int) (Math.random() * 6);
        String Nombre = "Deysi ";
        switch (valorRandom){
            case 1:
                System.out.println(txt);
                System.out.println(Nombre);
                System.out.println("1 de conejo");
                break;
            case 2:
                System.out.println(Nombre);
                System.out.println("2 de llama");
                break;
            case 3:
                System.out.println(Nombre);
                System.out.println("3 de aguila");
                break;
            case 4:
                System.out.println(Nombre);
                System.out.println("4 de ardilla");
                break;
            default:
                System.out.println(Nombre);
                System.out.println("Eres humanooooo");
        }

        //*** While y Do While
        System.out.println("---- WHILE -----");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("---- DO WHILE ----");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

        //*** FOR ****
        System.out.println("---- FOR ----");
        // for (DEFINIMOS EL VALOR ; comprobamos la condición y ejecutamos el codigo ; EJECUTAMOS AL FINAL DEL BLOQUE)
        System.out.println("EJEMPLO DE FOR 1");
        for (int K = 0; K < 5; K++) {
            System.out.println(K);
        }
        System.out.println("EJEMPLO DE FOR 2");
        for (int n = 0; n <= 10; n = n + 2) {
            System.out.println(n);
        }

        // Bucle anidado
        for (int a = 1; a <= 2; a++) {
            System.out.println("Outer: " + a); // Se ejecutará 2 veces

            // Inner loop
            for (int b = 1; b <= 3; b++) {
                System.out.println(" Inner: " + b); // al estar anidado se ejecutará 6 veces, 3 en cada pasada , en otras palabras 3*2
            }
        }
    }
    }


