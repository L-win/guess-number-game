import java.util.Scanner;
import java.util.Random;

class GuessNumber{
  private Scanner input;
  private static int number;
  private int userInput;
  public static void main(String a[]){
    GuessNumber game = new GuessNumber();
    System.out.println("\nGuess the number between 1 and 100.");
    setNumber();
    game.start();
  };
  private void start(){
    readUserInput();
    round();
  };
  private static void setNumber(){
    Random random = new Random();
    number = random.nextInt(100);
    number += 1;
  };
  private void readUserInput(){
    input = new Scanner(System.in);
    System.out.println("Enter number:");
    userInput = input.nextInt();
  };
  private void round(){
    if (userInput > number ){
      System.out.println("\nYour guess is GREATER..");
      GuessNumber game = new GuessNumber();
      game.start();
    }
    else if(userInput < number){
      System.out.println("\nYour guess is LOWER..");
      GuessNumber game = new GuessNumber();
      game.start();
    }
    else{
      System.out.println("\nCorrect!\n");
    }
  };
}
