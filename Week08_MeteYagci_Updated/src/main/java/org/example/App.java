package org.example;

/**
 * Entry point for the game application.
 */
public class App {

    /**
     * Private constructor to prevent instantiation.
     */
    private App() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * The main method to start the game.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        Game game = new Game();

        game.addCharacter(new Archer("Legolas", 90, 18));

        game.startGame();

    }
}
