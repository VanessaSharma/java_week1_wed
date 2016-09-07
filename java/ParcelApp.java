import java.io.Console;

public class Parcels {
  public static void main( String[] args ) {
    Console myConsole = System.console();

    System.out.println( "What is the length of side 1?");
    int userSide1 = Integer.parseInt(myConsole.readLine());
    System.out.pritnln( "What is the length of side 2?");
    int userSide2 = Integer.parseInt(myConsole.readLine());
    System.out.println( "What is the length of side 3?");
    int userSide3 = Integer.parseInt(myConsole.readLine());

    Parcels userParcel = new Parcel(userSide1, userSide2, userSide3);

    int volume = ( userSide1 * userSide2 * userSide3);

    System.out.pritnln("How much does your parcel weight in pounds?");
    int userParcelWeight = Integer.parseInt(myConsole.readLine());
    int weightCost = userParcelWeight * 1.5;

    System.out.println( "3, 5, or 7 day shipping?");
    int shipTime = Integer.parseInt(myConsole.readLine());

    Int costToShip = ( (volume/4) + weightCost + shipTime);
    System.out.pritnln("Your total cost for shipping is:/n" + costToShip);

  }
}
