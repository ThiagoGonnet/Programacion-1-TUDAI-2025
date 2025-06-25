import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ1 {
  public static void main(String[] args) {

    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero por favor: ");
      double numPositivoONegativo = Double.parseDouble(entrada.readLine());
      System.out.print("Ingrese un numero mas por favor: ");
      double numMayorACien = Double.parseDouble(entrada.readLine());
      System.out.println("Ingrese un numero mas por favor: ");
      int numeroSemana = Integer.parseInt(entrada.readLine());
      System.out.print("Ingrese una letra por favor: ");
      char letraConsonanteOVocal = entrada.readLine().charAt(0);
      System.out.print("Por favor ingrese 3 numeros: ");
      int num1 = Integer.parseInt(entrada.readLine());
      int num2 = Integer.parseInt(entrada.readLine());
      int num3 = Integer.parseInt(entrada.readLine());

      System.out.print("Consigna a. ");
      if (numPositivoONegativo > 0) {
        System.out.println("El número " + numPositivoONegativo + " es positivo.");
      } else {
        System.out.println("El número " + numPositivoONegativo + " es negativo.");
      }
      System.out.println("Consigna b.");
      if (numMayorACien > 100) {
        System.out.println(numMayorACien + " es mayor a cien.");
      } else {
        System.out.println(numMayorACien + " no es mayor a cien.");
      }
      System.out.println("Consigna c.");
      switch (numeroSemana) {
        case 1:
          System.out.println("Es lunes");
          break;
        case 2:
          System.out.println("Es martes");
          break;
        case 3:
          System.out.println("Es miércoles");
          break;
        case 4:
          System.out.println("Es jueves");
          break;
        case 5:
          System.out.println("Es viernes");
          break;
        case 6:
          System.out.println("Es sabádo");
          break;
        case 7:
          System.out.println("Es domingo");
          break;
        default:
          System.out.println("No se ingreso un número entre 1 y 7.");
          break;
      }
      System.out.println("Consigna d.");
      switch (letraConsonanteOVocal) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
          System.out.println(letraConsonanteOVocal + " es vocal");
          break;
        default:
          System.out.println(letraConsonanteOVocal + " es consonante");
          break;
      }
      System.out.println("Consigna e.");

      if (num1 < num2 && num2 < num3) {
        System.out.println("Creciente");
      } else if (num1 > num2 && num2 > num3) {
        System.out.println("Decreciente");
      } else {
        System.out.println("Error");
      }
    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
    /*
     * Escribir un programa completo (declaración de constantes y
     * variables, carga de datos, procesamiento e impresión de
     * resultados) para cada caso o ítem que:
     * a. solicite un número e indique si es positivo o negativo.
     * b. solicite un número e imprima “grande” si es mayor a 100 y
     * “chico “ si es menor.
     * c. solicite un número del 1 al 7 e imprima el día de la semana.
     * d. solicite una letra e imprima si es vocal o consonante.
     * e. solicite 3 números e imprima “creciente” si los tres números
     * están en orden creciente, “decreciente” si están en orden
     * decreciente o “error” si no cumplen ningún orden
     */
  }
}
