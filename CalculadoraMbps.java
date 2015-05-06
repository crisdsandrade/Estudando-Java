public class CalculadoraMbps {
  public static void main(String[] args) {
    int megabits = 4;
    double megabytes = (double) megabits / 8;
    double kilobytes = megabytes * 1024;


    System.out.println();
    System.out.print("\n" + megabits + "Mbps corresponde a: \n-> " + megabytes + "MB por segundo.\n-> " + kilobytes + "KB por segundo.");
    System.out.println("\n");
  }
}
