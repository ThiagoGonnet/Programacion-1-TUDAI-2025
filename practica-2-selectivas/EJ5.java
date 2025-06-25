import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ5 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      int hora = Integer.parseInt(entrada.readLine());
      if (hora >= 0 && hora <= 5) {
        System.out.println("Ingrese la temperatura: ");
        int temperatura = Integer.parseInt(entrada.readLine());
        if (temperatura < 20) {
          System.out.println("Encender la calefacción");
        } else if (temperatura > 25) {
          System.out.println("Apagar calefacción.");
        } else if (temperatura >= 20 && temperatura <= 25) {
          System.out.println("Calefacción encendida, no abra las ventanas!!!");
        }
      }

      if (hora >= 6 && hora <= 11) {
        System.out.println("Ingrese un caracter minuscula: ");
        char caracter = entrada.readLine().charAt(0);
        switch (caracter) {
          case 'a', 'e', 'i', 'o', 'u':
            switch (hora) {
              case 7:
                System.out.println(hora + "Tiene 3 vocales");
                break;
              case 8:
                System.out.println(hora + "Tiene 2 vocales");
                break;
              case 9:
                System.out.println(hora + "Tiene 3 vocales");
                break;
              case 10:
                System.out.println(hora + "Tiene 2 vocales");
                break;
              case 11:
                System.out.println(hora + "Tiene 2 vocales");
                break;
            }
          default:
            switch (hora) {
              case 7:
                System.out.println(hora + "Tiene 2 consonantes");
                break;
              case 8:
                System.out.println(hora + "Tiene 2 consonantes");
                break;
              case 9:
                System.out.println(hora + "Tiene 2 consonantes");
                break;
              case 10:
                System.out.println(hora + "Tiene 2 consonantes");
                break;
              case 11:
                System.out.println(hora + "Tiene 2 consonantes");
                break;
            }
        }
      }
      int min = 12;
      int max = 17;
      if ((hora >= min && hora <= max)) {
        if ((hora % 2 == 0)) {
          double promedio = hora / min;
          System.out.print("Promedio entre hora ingresada y limite inferior del rango: " + promedio);
        } else {
          double promedio = hora / max;
          System.out.print("Promedio entre hora ingresada y limite superior del rango: " + promedio);
        }
      }
      int clave = 364;
      if (hora >= 18 && hora <= 23) {
        System.out.print("Ingrese una clave por favor: ");
        int claveIngresada = Integer.parseInt(entrada.readLine());
        boolean login = claveIngresada == clave;
        if (login) {
          System.out.print("Ingrese una segunda clave por favor: ");
          int segundaClave = Integer.parseInt(entrada.readLine());
          int primerCentenaClaveIngresada = segundaClave / 100;
          int primerCentenaClaveAlmacenada = clave / 100;
          if (primerCentenaClaveIngresada % primerCentenaClaveAlmacenada == 0) {
            System.out.print("Clave correcta");
          }
        }
      }
    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
  }
}

/*
 * Escribir un programa que solicite una hora del día (valor entero de
 * la hora solamente) y resuelva en cada caso:
 *
 * a. Si la hora está entre las 0 y las 5, pida ingresar la
 * temperatura y si la misma es menor a 20 grados imprima
 * “Encender la calefacción”. Si es mayor a 25, imprima
 * “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
 * “Calefacción encendida, no abra las ventanas!!!”.
 *
 * b. Si la hora está entre las 6 y las 11, pida un carácter letra
 * minúscula y si es vocal imprima por la consola la cantidad de
 * vocales que tiene la palabra que corresponde con la hora.
 * Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
 * cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
 * tiene 2 consonantes.
 *
 * c. Si la hora está entre las 12 y 17 y es par, imprima el
 * promedio entre la hora ingresada y el límite inferior del
 * rango. Si la hora es impar debe imprimir el promedio entre la
 * hora ingresada y el límite superior del rango.
 *
 * d. Si la hora está entre las 18 y 23, pida ingresar una clave
 * numérica, si coincide con la clave almacenada previamente
 * en una constante, pida ingresar una segunda clave de
 * verificación (un valor entre 100 y 999). Para esta segunda
 * clave (que solo la conoce el usuario) se debe verificar que el
 * dígito de mayor peso (centena) sea múltiplo del dígito de
 * mayor peso de la clave almacenada. Si todo esto se cumple
 * debería mostrar por la consola el mensaje “Clave correcta”.
 *
 * Ejemplo: clave almacenada 364, clave ingresada 364,
 * segunda clave ingresada 698.
 */
