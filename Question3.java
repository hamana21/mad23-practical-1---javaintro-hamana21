import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = multiplyByItself(number);
        System.out.println("result: " + result);
    }

    
    private static int multiplyByItself(int num) {
        return num * num;
    }
      
  }
}
