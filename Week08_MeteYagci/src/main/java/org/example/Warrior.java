package org.example;

public class Warrior extends Character {

    // Changed: Constructor now initializes name, health, and attackPower fields with provided parameters.

    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    // Changed: Updated method name to follow Java naming conventions (camelCase).



    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }
}