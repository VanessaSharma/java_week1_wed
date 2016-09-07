import java.io.Console;

public class App {
  public static void main( String[] args ) {
    Console myConsole = System.console();

    System.out.println( "What is the length of side A? ");
    int userSideA = Integer.parseInt(myConsole.readLine());

    System.out.println( "What is the length of side B? ");
    int userSideB = Integer.parseInt(myConsole.readLine());

    System.out.println( "What is the length of side C? ");
    int userSideC = Integer.parseInt(myConsole.readLine());

    Triangle userTriangle = new Triangle(userSideA, userSideB, userSideC);

    if (userSideA == userSideB && userSideA == userSideC) {
      System.out.println( "Equilateral");
    }
    else if (userSideA == userSideB || userSideB == userSideC || userSideA == userSideC ) {
      System.out.println( "Isosceles");
    }
    else if (userSideA != userSideB || userSideB != userSideC || userSideA != userSideC ) {
      System.out.println( "Scalene");
    } else {
      System.out.println( "We don't recognize your triangle.");
    }
  }
}
