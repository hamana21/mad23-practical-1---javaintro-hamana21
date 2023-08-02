import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the right-angle triangle: ");
        int baseLength = scanner.nextInt();
        printRightAngleTriangle(baseLength);
    }

    private static void printRightAngleTriangle(int base) {
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
