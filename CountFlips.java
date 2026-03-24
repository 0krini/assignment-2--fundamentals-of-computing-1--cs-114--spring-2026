public class CountFlips {
  public static void main(String[] args) {
     Coin coin = new Coin();

    int headsCount = 0;
    int tailsCount = 0;

    // Flip the coin 100 times
    for (int i = 0; i < 100; i++) {
      coin.flip();

      if (coin.isHeads()) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }

    // Print results
    System.out.println("Number of Heads: " + headsCount);
    System.out.println("Number of Tails: " + tailsCount);
  }
}
