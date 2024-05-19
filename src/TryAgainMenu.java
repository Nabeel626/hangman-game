import java.util.Scanner;

public class TryAgainMenu {

    protected void tryAgain() {
        Scanner scanner = new Scanner(System.in);
        boolean state = true;

        System.out.println();
        System.out.println("|-----------------------------------------|");
        System.out.println("|     WOULD YOU LIKE TO PLAY AGAIN!!      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|    Type 'y' for yes and 'n' for no      |");
        System.out.println("|      ^  This is Case Sensitive  ^       |");
        System.out.println("|-----------------------------------------|");
        System.out.println();

        while(state) {
            System.out.println("Type your choice: ");
            String choose = scanner.nextLine();

            switch (choose) {
                case "y":
                    ChooseDifficultyMenu chooseDifficultyMenu = new ChooseDifficultyMenu();
                    chooseDifficultyMenu.chooseDifficulty();
                    state = false;
                    break;

                case "n":
                    System.out.println("YOU ARE RETURNING BACK TO MAIN MENU");
                    System.out.println("Loading.......");
                    MainMenu menu = new MainMenu();
                    menu.state();
                    state = false;
                    break;

                default:
                    System.out.println("PLEASE ENTER A VALID CHOICE!!!");
                    break;
            }
        }

    }
}
