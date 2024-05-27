package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the game with a list of characters and methods to manage the game.
 */
public class Game {

    /** The list of characters in the game. */
    private List<Archer> characters = new ArrayList<Archer>();

    /**
     * Constructs a new Game instance.
     */
    public Game() {
        // No initialization required at this time.
    }

    /**
     * Adds a character to the game.
     *
     * @param character The character to add.
     */
    public void addCharacter(final Archer character) {
        characters.add(character);
    }

    /**
     * Starts the game by simulating turns between characters.
     */
    public void startGame() {
        int turn = 0;
        boolean gameOver = false;

        while (!gameOver) {
            AbstractCharacter attacker = characters.get(turn % characters.size());
            AbstractCharacter defender = characters.get((turn + 1) % characters.size());


            attacker.equals(defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName());

            if (defender.isDefeated()) {
                System.out.println(defender.getName() + " is defeated!");
                gameOver = isGameOver(); // Check game over state using a method
            }

            turn++;
        }
    }

    /**
     * Checks if the game is over by iterating through characters and checking if any are defeated.
     *
     * @return True if the game is over, false otherwise.
     */
    private boolean isGameOver() {
        for (Archer character : characters) {
            if (AbstractCharacter.isDefeated()) {
                return true;
            }
        }
        return false;
    }
}
