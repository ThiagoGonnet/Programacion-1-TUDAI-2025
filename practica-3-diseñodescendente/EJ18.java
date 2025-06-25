public class EJ18 {
  public static void main(String[] args) {
    final int MAX = 10000;
    for (int i = 2; i <= MAX; i++) {
      if (esNumPerfecto(i)) {
        System.out.println("Es número perfecto: " + i);
      }
    }
  }

  public static boolean esNumPerfecto(int num) {
    int sumaDivisores = 0;
    for (int i = 1; i < num; i++) { // divisores propios
      if (num % i == 0) {
        sumaDivisores += i;
      }
    }
    return sumaDivisores == num;
  }
}
