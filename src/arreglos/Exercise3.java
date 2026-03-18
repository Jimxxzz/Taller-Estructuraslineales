import java.util.Scanner;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int numeroElementos = entrada.nextInt();
        Random generadorAleatorio = new Random();
        long[] arregloNumeros = new long[numeroElementos];
        long[] arregloFactoriales = new long[numeroElementos];
        for (int indice = 0; indice < numeroElementos; indice++) {
            arregloNumeros[indice] = generadorAleatorio.nextInt(12) + 1; // 1 to 12
            arregloFactoriales[indice] = factorial(arregloNumeros[indice]);
        }
        System.out.println("Números:");
        for (long numero : arregloNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println("Factoriales:");
        for (long factorial : arregloFactoriales) {
            System.out.print(factorial + " ");
        }
        System.out.println();
        entrada.close();
    }

    static long factorial(long numero) {
        if (numero == 0 || numero == 1) return 1;
        return numero * factorial(numero - 1);
    }
}