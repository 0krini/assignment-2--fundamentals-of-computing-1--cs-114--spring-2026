import java.util.scanner;
public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int verses;

    // Input validation: must be between 1 and 100
    do {
      System.out.print("Enter number of verses to print (1–100): ");
      while (!scanner.hasNextInt()) {
        System.out.print("Invalid input. Enter an integer: ");
        scanner.next(); // discard invalid input
      }
      verses = scanner.nextInt();
    } while (verses < 1 || verses > 100);

    int bottles = 100;

    // Loop to print verses
    for (int i = 0; i < verses; i++) {
      System.out.println(bottles + " bottles of beer on the wall");
      System.out.println(bottles + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println((bottles - 1) + " bottles of beer on the wall");
      System.out.println(); // blank line between verses

      bottles--;
    }

    scanner.close();
  }
}
