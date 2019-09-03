import java.util.Scanner;
import java.util.Random;

class GuessNumber{
  private Scanner input;
  private int number;
  private int userInput;
  public static void main(String a[]){
    // Start game
    GuessNumber game = new GuessNumber();
    game.setNumber();
    game.readUserInput();
    game.round();
  };
  private void setNumber(){
    // Set random number
    Random random = new Random();
    number = random.nextInt(100);
    number += 1;
    //number = 1; 
  };
  private void readUserInput(){
    // Read user input
    // Check if it is int
    input = new Scanner(System.in);
    System.out.println("\nEnter number:");
    userInput = input.nextInt();
  };
  private void round(){
    
  };
}
