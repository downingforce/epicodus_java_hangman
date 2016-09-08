import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Choose a word to play Hang Man with");
    String hangManAnswer = myConsole.readLine();
    System.out.println("Choose the number of attempts");
    Integer hangManAttempts = Integer.parseInt(myConsole.readLine());
    HangMan game = new HangMan(hangManAnswer, hangManAttempts);
    System.out.println(game.getDashed());
    while(!game.isFinished()){
      System.out.println("Choose a letter");
      String stringGuess = myConsole.readLine();
      char userGuess = stringGuess.charAt(0);
      String updatedGame = game.guess(userGuess);
      System.out.println(updatedGame);

    }


  }
}
