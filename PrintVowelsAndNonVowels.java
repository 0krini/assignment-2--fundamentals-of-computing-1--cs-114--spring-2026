import java.util.scanner;
public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;
    int nonVowelCount = 0;

    // Loop through each character in the string
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);

      if (ch == 'a') {
        countA++;
      } else if (ch == 'e') {
        countE++;
      } else if (ch == 'i') {
        countI++;
      } else if (ch == 'o') {
        countO++;
      } else if (ch == 'u') {
        countU++;
      } else {
        nonVowelCount++;
      }
    }

    // Print results
    System.out.println("a: " + countA);
    System.out.println("e: " + countE);
    System.out.println("i: " + countI);
    System.out.println("o: " + countO);
    System.out.println("u: " + countU);
    System.out.println("Non-vowel characters: " + nonVowelCount);

    scanner.close();
  }
}
