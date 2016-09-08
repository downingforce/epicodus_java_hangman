import java.io.Console;
import java.util.List;
import java.util.ArrayList;


public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Would you like word generator to be: Computer or Human");
    String gameType = myConsole.readLine();
    if(gameType.equalsIgnoreCase("computer")){
      HangMan gameC = new HangMan();
      gameC.readFile("test.txt");
      gameC.computersWord();
      System.out.println(gameC.getDashed());
      while(!gameC.isFinished()){
        System.out.println("Choose a letter");
        String stringGuess = myConsole.readLine();
        char userGuess = stringGuess.charAt(0);
        String updatedGame = gameC.guess(userGuess);
        System.out.println(updatedGame);
      }
    }else if(gameType.equalsIgnoreCase("human")){
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
    }else {
      System.out.println("You lost before you began");
    }


    }








//     ArrayList<String> test = new ArrayList<String>();
//     HangMan hang = new HangMan();
//     // List<String> dictionary = new ArrayList<String>();
//     // String fileName = "test.txt";
// hang.readFile("test.txt");
//   String answer = hang.computersWord();
//
//     // String answer = hang.computersWord();
//     System.out.println(answer);
  }
