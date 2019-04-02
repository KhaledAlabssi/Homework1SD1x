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
}
