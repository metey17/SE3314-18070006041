package org.example;
/**
 * Represents a character in the game with name, health, and attack power.
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    // Changed: Constructor now initializes name, health, and attackPower fields with provided parameters.

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Changed: Updated method name to follow Java naming conventions (camelCase).

    public String getName() {
        if(name != null) return name;
        else return "Unknown";
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    // changed: Should not be underscored

    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    public abstract void specialAttack(Character opponent);
    /**
     * Checks if the character is defeated (health <= 0).
     *
     * @return True if the character is defeated, false otherwise.
     */
    public boolean isDefeated() {
        return health <= 0;
    }

    // Removed: Unused method removed.
    // public void complexMethodExample() {}
}
