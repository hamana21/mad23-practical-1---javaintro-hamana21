import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        double bmi = calculateBMI(height, weight);
        System.out.println("Your BMI is: " + bmi);
  }

  private static double calculateBMI(double height, double weight) {
    return weight / (height * height);
  }
}
