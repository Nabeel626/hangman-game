import java.util.Scanner;

public class MainMenu {

    public void state() {

        Scanner scanner = new Scanner(System.in);
        boolean state = true;

        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("|                                 Welcome to HANGMAN                                      |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("|  If you would like to play type 'PLAY', or if you want to close the game type 'CLOSE'!  |");
        System.out.println("|               ^               This is Case Sensitive                  ^                 |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println();

        while (state) {

            System.out.println("Type your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "PLAY":
                    System.out.println("YOU CHOSE TO PLAY!!!");
                    ChooseDifficultyMenu chooseDifficultyMenu = new ChooseDifficultyMenu();
                    chooseDifficultyMenu.chooseDifficulty();
                    state = false;
                    break;

                case "CLOSE":
                    System.out.println("YOU CHOOSE TO CLOSE. GOODBYE!!!!");
                    state = false;
                    System.exit(2);
                    break;

                default:
                    System.out.println("PLEASE ENTER A VALID CHOICE!!!");
                    System.out.println();
                    break;
            }
        }
    }
}


