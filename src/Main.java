import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Would you like to play a game?");
    System.out.print("Type yes or no: ");
    String answer = obj.next();

    switch (answer){
        case "yes" : gamefunc();
            break;

        case "no" :
            System.out.println("Maybe next time. Goodbye.");
            break;
    }

    }
    public static void gamefunc(){
        RandomNumGen generator = new RandomNumGen();
        int randomNumber = generator.generateRandomInt(100);
        int attempts = 0;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Great! I am thinking of a number.. Can you guess it?");
        System.out.print("Enter number: ");
        int userInput = obj1.nextInt();
        attempts++;
        if(userInput == randomNumber){
            System.out.println("You guessed correctly! The number was " + randomNumber + " and it took you " + attempts + " attempt to guess.");
        }

        while (userInput < randomNumber){
            System.out.println("Hmm.. Your guess is too low. Try again");
            System.out.println("Enter number: ");
            userInput = obj1.nextInt();
            attempts++;
            if (userInput > randomNumber){
                System.out.println("Hmm.. Your guess is too high. Try again");
                System.out.println("Enter number: ");
                userInput = obj1.nextInt();
                attempts++;
            }
        }
        while (userInput > randomNumber){
            System.out.println("Your guess is too high. Try again");
            System.out.println("Enter number: ");
            userInput = obj1.nextInt();
            attempts++;
            if (userInput < randomNumber){
                System.out.println("Hmm.. Your guess is too low. Try again");
                System.out.print("Enter number: ");
                userInput = obj1.nextInt();
                attempts++;
            }
        }
        if (userInput == randomNumber) {
            System.out.println("You guessed correctly! The number was " + randomNumber + " and it took you " + attempts + " attempts to guesss.");
        }
    }
}