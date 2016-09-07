import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ScrabbleScore {
  public static void main(String[] args) {
    Console myConsole = System.console();
    String letterList = "aeioulnrstdgbcmpfhvwykjxqz";
    Integer[] valueOfLetters = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 8, 8, 10, 10};

    System.out.println( "What is your word?");
    String userAnswer = myConsole.readLine();
    char[] letters = userAnswer.toCharArray();

    int totalScore = 0;
    for (int letters : letterList) {
      totalScore += valueOfLetters[letterList.indexOf(letters)];
    }

  //  char[] userLetters = userAnswer.toCharArray();



}
}
