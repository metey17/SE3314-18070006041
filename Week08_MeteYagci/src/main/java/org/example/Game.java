package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * Represents the game with a list of characters and methods to manage the game.
 */
public class Game {
    private List<Character> characters = new ArrayList<Character>();
    /**
     * Adds a character to the game.
     *
     * @param character The character to add.
     */
    public void addCharacter(Character character) {
        characters.add(character);
    }
    // Changed: Updated method name to follow Java naming conventions (camelCase).
    /**
     * Starts the game by simulating turns between characters.
     */
    public void startGame() {
        int turn = 0;
        boolean gameOver = false;

        while (!gameOver) {
            Character attacker = characters.get(turn % characters.size());
            Character defender = characters.get((turn + 1) % characters.size());

            attacker.specialAttack(defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName());

            if (defender.isDefeated()) {
                System.out.println(defender.getName() + " is defeated!");
                gameOver = isGameOver(); // Check game over state using a method
            }

            turn++;
        }
    }
    // Changed: Updated method name to follow Java naming conventions (camelCase).
    /**
     * Checks if the game is over by iterating through characters and checking if any are defeated.
     *
     * @return True if the game is over, false otherwise.
     */
    private boolean isGameOver() {
        for (Character character : characters) {
            if (character.isDefeated()) {
                return true;
            }
        }
        return false;
    }

}
