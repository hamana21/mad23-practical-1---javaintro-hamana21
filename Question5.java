import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        int mode = findMode(numbers);
        System.out.println("Mode: " + mode);
    }

    private static int findMode(int[] numbers) {
        int maxCount = 0;
        int mode = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }
        return mode;
    }    
  }
}
