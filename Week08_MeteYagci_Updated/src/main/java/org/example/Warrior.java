package org.example;

/**
 * Represents a Warrior character in the game.
 */
public class Warrior extends AbstractCharacter {

    /**
     * Constructs a new Warrior with the specified name, health, and attack power.
     *
     * @param name       The name of the Warrior.
     * @param health     The health points of the Warrior.
     * @param attackPower The attack power of the Warrior.
     */
    public Warrior(final String name, final int health, final int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    @Override
    public void specialAttack(final AbstractCharacter opponent) {
        opponent.takeDamage(getAttackPower() * 2);
    }
}
