import java.util.Scanner;
import java.util.Random;

class GuessNumber{
  private Scanner input;
  private static int number;
  private int userInput;
  public static void main(String a[]){
    // Start game
    GuessNumber game = new GuessNumber();
    setNumber();
    game.start();
  };
  private void start(){
    //setNumber();
    readUserInput();
    round();
  };
  private static void setNumber(){
    // Set random number
    Random random = new Random();
    number = random.nextInt(100);
    number += 1;
    //number = 5;
  };
  private void readUserInput(){
    // Read user input
    // Check if it is int
    input = new Scanner(System.in);
    System.out.println("\nEnter number:");
    userInput = input.nextInt();
  };
  private void round(){
    if (userInput > number ){
      System.out.println("\nYour guess is GREATER..");
      GuessNumber game = new GuessNumber();
      game.start();
      //System.out.println(""+game.number);
    }
    else if(userInput < number){
      System.out.println("\nYour guess is LOWER..");
      GuessNumber game = new GuessNumber();
      game.start();
      //System.out.println(""+game.number);
    }
    else{
      System.out.println("\nCorrect!\n");
    }
  };
}
