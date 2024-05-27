package org.example;

/**
 * Represents a Mage character in the game.
 */
public class Mage extends AbstractCharacter {

    /**
     * Constructs a new Mage with the specified name, health, and attack power.
     *
     * @param name       The name of the Mage.
     * @param health     The health points of the Mage.
     * @param attackPower The attack power of the Mage.
     */
    public Mage(final String name, final int health, final int attackPower) {
        super(name, health, attackPower);
    }



    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    @Override
    public void specialAttack(final AbstractCharacter opponent) {
        opponent.takeDamage(getAttackPower() + 50);
    }
}
