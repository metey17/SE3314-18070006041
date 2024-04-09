package org.example;

public class Archer extends Character {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }



    // it was special_Attack  and i changed for specialAttack


    /**
     * Performs a special attack on the opponent character.
     *
     * @param opponent The character being attacked.
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }
}