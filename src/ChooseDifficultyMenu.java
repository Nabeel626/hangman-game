import java.util.Scanner;

public class ChooseDifficultyMenu {

    public String easyMode;
    public String mediumMode;
    public String hardMode;

    public void chooseDifficulty() {
        Scanner scanner = new Scanner(System.in);
        boolean state = true;

        System.out.println();
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|                  CHOOSE YOUR DIFFICULTY                  |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println("|    Type 'E' for Easy, 'M' for Medium and 'H' for Hard    |");
        System.out.println("|               ^  This is Case Sensitive  ^               |");
        System.out.println("|----------------------------------------------------------|");
        System.out.println();

        while(state) {
            System.out.println("Type your choice: ");
            String choose = scanner.nextLine();

            switch (choose) {
                case "E":
                    System.out.println("You have Chosen Easy, GOODLUCK :)");
                    setEasyMode("easy");
                    GameStart startGameEasy = new GameStart();
                    startGameEasy.play(getEasyMode());
                    break;

                case "M":
                    System.out.println("You have Chosen Medium, GOODLUCK :)");
                    setMediumMode("medium");
                    GameStart startGameMedium = new GameStart();
                    startGameMedium.play(getMediumMode());
                    state = false;
                    break;

                case "H":
                    System.out.println("You have Chosen Hard, GOODLUCK :)");
                    setHardMode("hard");
                    GameStart startGameHard = new GameStart();
                    startGameHard.play(getHardMode());
                    state = false;
                    break;

                default:
                    System.out.println("PLEASE ENTER A VALID CHOICE!!!");
                    System.out.println();
                    break;
            }
        }
    }

    public String getEasyMode() {
        return easyMode;
    }

    public void setEasyMode(String easyMode) {
        this.easyMode = easyMode;
    }

    public String getMediumMode() {
        return mediumMode;
    }

    public void setMediumMode(String mediumMode) {
        this.mediumMode = mediumMode;
    }

    public String getHardMode() {
        return hardMode;
    }

    public void setHardMode(String hardMode) {
        this.hardMode = hardMode;
    }
}
