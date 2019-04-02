package whackamole;


    // Create a class called WhackAMole.
public class WhackAMole {
    // Create instance variables called: score, molesLeft and attemptsLeft.
    int score;
    int molesLeft;
    int attemptsLeft;
    // and one called: moleGrid which is a 2-dimensional array of chars.
    char [][] moleGrid;

    // Constructor for the game, make sure to initialize the moleGrid with the appropriate character.
    WhackAMole(int numAttempts, int gridDimension) {
        this.score = 0;
        this.molesLeft = 0;
        this.attemptsLeft = 0;
        this.moleGrid = new char[gridDimension][gridDimension];

    }
    // Create the following methods.
    // boolean place(int x, int y) Given a location, place a mole at that location, return true if you can.
    // void whack(int x, int y) given a location, take a whack at that location, if that location contain a mole,
    // void printGridToUser() print the grid without showing where moles are,
    // void printGrid() print the grid completely.
    public boolean place(int x, int y) {
        // check if the slot is empty?
        if (this.moleGrid[x][y] != 'M') {
            this.moleGrid[x][y] = 'M';
            this.molesLeft ++;
            System.out.println("Still there " + this.molesLeft + " mole to go.");
            return true;
        }
        else {
            System.out.println("Here is a mole!.");
            return false;
        }
    }

}
