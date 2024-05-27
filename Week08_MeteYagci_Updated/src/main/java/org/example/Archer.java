package org.example;

/**
 * Represents an Archer character in the game.
 */

public class Archer extends AbstractCharacter {

    /**
     * Constructs a new Archer with the specified name, health, and attack power.
     *
     * @param name       The name of the Archer.
     * @param health     The health points of the Archer.
     * @param attackPower The attack power of the Archer.
     */

    public Archer(final String name,  final int health, final int attackPower) {
        super(name, health, attackPower);
    }






    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    @Override
    public void specialAttack(final AbstractCharacter opponent) {
        opponent.takeDamage(getAttackPower() + 20);
    }
}