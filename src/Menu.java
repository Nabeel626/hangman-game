import java.util.Scanner;

public class Menu {

    public void state() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("|                                Welcome to HANGMAN                                       |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("|  If you would like to play type 'PLAY', or if you want to close the game type 'CLOSE'!  |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println();

        while (true) {

            System.out.println("Type your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "PLAY":
                    System.out.println("YOU CHOSE TO PLAY!!!");
                    GameStart startGame = new GameStart();
                    startGame.play();
                    break;

                case "CLOSE":
                    System.out.println("YOU CHOOSE TO CLOSE. GOODBYE!!!!");
                    System.exit(1);
                    break;

                default:
                    System.out.println("PLEASE ENTER A VALID CHOICE!!!");
                    System.out.println();
                    break;
            }
        }
    }
}


