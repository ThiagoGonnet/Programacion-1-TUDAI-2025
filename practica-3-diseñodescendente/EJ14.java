public class EJ14 {
  public static void main(String[] args) {
    char caracterIngresado = obtenerCaracter();
    while (caracterIngresado != '*') {
      System.out.println(tipoCaracter(caracterIngresado));
      caracterIngresado = obtenerCaracter();
    }
  }

  public static char obtenerCaracter() {
    char caracter;
    System.out.println("Ingrese un caracter por favor: ");
    caracter = Utils.leerChar();
    return caracter;
  }

  public static String tipoCaracter(char caracterIngresado) {
    String tipoCaracter = "";

    if (caracterIngresado >= 'a' && caracterIngresado <= 'z') {
      tipoCaracter = "es caracter letra minuscula";
      System.out.println(esVocalOConsonante(caracterIngresado));
    } else if (caracterIngresado >= '0' && caracterIngresado <= '9') {
      tipoCaracter = "es caracter digito";
    } else if (caracterIngresado >= 'A' && caracterIngresado <= 'Z') {
      tipoCaracter = "es letra mayuscula";
    } else {
      tipoCaracter = "es otro tipo de caracter";
    }
    return tipoCaracter;
  }

  public static String esVocalOConsonante(char caracterLetra) {
    String valorLetra = "";
    switch (caracterLetra) {
      case 'a', 'e', 'i', 'o', 'u':
        valorLetra = "es vocal";
        break;
      default:
        valorLetra = "es consonante.";
        break;
    }
    return valorLetra;
  }

}

/*
 * 14. Escribir un programa que mientras el usuario ingresa un
 * carácter distinto del carácter ‘*’, invoque a un método que imprima
 * si es carácter dígito o carácter letra minúscula, y si es letra
 * minúscula imprimir si es vocal o consonante.
 */
