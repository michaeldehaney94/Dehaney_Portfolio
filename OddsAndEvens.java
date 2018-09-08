import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.println("Welcome! Let’s play a game called \"Odds and Evens\". ");
        System.out.println();
        System.out.println("The game is similar to rock paper scissors. It is played between two players,");
        System.out.println("in your version it will be you versus the computer. Each player will choose either \"odds\" or \"evens\",");
        System.out.println("since you’re playing the computer you will get first pick. Once you have chosen your side, you each choose a ");
        System.out.println("number of fingers to play- 0 to 5. The winner is determined by whether the sum of your ");
        System.out.println("fingers is odd or even (depending on what you chose).");
        System.out.println();
        System.out.println();
        System.out.print("What is your name?");
        String name = input.nextLine(); //user's name
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?"); 
        //user will only type 'O' or 'E' here.
        System.out.println(); 
        String Letter_Answer = input.nextLine();
        
        //OUTPUT
        if (Letter_Answer.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (Letter_Answer.equals("E")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }

        System.out.println("---------------------------------------------------------------");
        //INPUT
        System.out.print("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        System.out.print("The computer plays number ?");
        Random rand = new Random();
        int computer = rand.nextInt(6);

        //PROCESSING
        int sum = fingers + computer; //this is the result of what the computer and player
        //I needed to declare sum as an 'integer' for it to read the calculation below.
        System.out.print(sum);
       double oddOrEven = sum % 2;
        System.out.println(oddOrEven);
        
        System.out.println("---------------------------------------------------------------");
        //OUTPUT
        if (oddOrEven == 0) {
            System.out.println("Even! You Win.");
            System.out.println("The computer lose.");
        } else if (oddOrEven > 0) {
            System.out.print("The computer wins!");
            System.out.println("You lose against the computer.");
            System.out.println();
            System.out.println();
            System.out.println("Thank you for playing Odds and Even! Play again soon!");

        }

    }
}

/* This program was written by Michael Dehaney as a edX java project to test the use of if-else statements,
boolean statements, scanners and class declaration.*/
