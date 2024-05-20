public class DrawHangman {
    public void drawHangmanBoard(int lives) {
        if(lives == 7) {
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 6) {
            System.out.println("    |----------");
            System.out.println("    |/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 5) {
            System.out.println("    |----------");
            System.out.println("    |/    O");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 4) {
            System.out.println("    |----------");
            System.out.println("    |/   O");
            System.out.println("    |    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 3) {
            System.out.println("    |----------");
            System.out.println("    |/   O");
            System.out.println("    |   -|");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 2) {
            System.out.println("    |----------");
            System.out.println("    |/   O");
            System.out.println("    |   -|-");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 1) {
            System.out.println("    |----------");
            System.out.println("    |/   O");
            System.out.println("    |   -|-");
            System.out.println("    |   /");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");

        } else if(lives == 0){
            System.out.println("    |----------");
            System.out.println("    |/   O");
            System.out.println("    |   -|-");
            System.out.println("    |   / \\");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
        }
    }
}
