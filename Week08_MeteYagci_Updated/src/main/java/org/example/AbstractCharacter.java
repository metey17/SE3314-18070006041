package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a character in the game with name, health, and attack power.
 */
public abstract class AbstractCharacter {
    /** The name of the character. */
    private String name;

    /** The health points of the character. */
    private static int health;

    /** The attack power of the character. */
    private int attackPower;

    /**
     * Constructs a new character with the specified name, health, and attack power.
     *
     * @param name       The name of the character.
     * @param health     The health points of the character.
     * @param attackPower The attack power of the character.
     */
    public AbstractCharacter(final String name,final int health,final int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name ;
    }

    /**
     * ArrayList.
     *
     */
    private List<AbstractCharacter> characters = new ArrayList();

    /**
     * Gets the health points of the character.
     *
     * @return The health points of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health points of the character.
     *
     * @param health The health points to set.
     */
    public void setHealth(final int health) {
        this.health = health;
    }

    /**
     * Gets the attack power of the character.
     *
     * @return The attack power of the character.
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * Sets the attack power of the character.
     *
     * @param attackPower The attack power to set.
     */
    public void setAttackPower(final int attackPower) {
        this.attackPower = attackPower;
    }

    /**
     * Reduces the health points of the character by the specified damage.
     *
     * @param damage The amount of damage to take.
     */
    public void takeDamage(final int damage) {
        health -= damage;
    }

    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    public abstract void specialAttack(AbstractCharacter opponent);

    /**
     * Checks if the character is defeated (health <= 0).
     *
     * @return True if the character is defeated, false otherwise.
     */
    public static boolean isDefeated() {
        return health <= 0;
    }
}
