package org.example;

public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    @Override
    public void specialAttack(Character Opponent) {
        Opponent.takeDamage(attackPower + 50);
    }
}
