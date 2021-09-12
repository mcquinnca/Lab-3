import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to count down or up from:");
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    System.out.println("\n \n" + count);

    // loop to count up or down to zero
    while (count != 0) {
      // function to count down if the number is positive
      if (count > 0) {
        count--;
        System.out.println(count);
      }
      // Function to count up the the number is negative
      else if (count < 0) {
        count++;
        System.out.println(count);
      }
    }
    System.out.println("Blast off!");
  }
}