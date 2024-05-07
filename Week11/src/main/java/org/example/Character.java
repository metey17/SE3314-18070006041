package org.example;

/**
 * The Character class represents a character in the "The Lord of the Rings" universe.
 */
public class Character {
    /** The name of the character. */
    private String name;

    /** The race of the character (e.g., Hobbit, Elf). */
    private String race;

    /** The age of the character. */
    private int age;

    /**
     * Constructs a Character object with the specified name, race, and age.
     *
     * @param name the name of the character
     * @param race the race of the character (e.g., Hobbit, Elf)
     * @param age  the age of the character
     */
    public Character(final String name, final String race,final int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Prints the details of the character, including their race and age.
     */
    public void printDetails() {
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit");
        } else if (race.equals("Elf")) {
            if (name.equals("Legolas")) {
                System.out.println("Character is Legolas, an Elf");
            } else {
                System.out.println("Character is an Elf");
            }
        }

        if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo")) {
            System.out.println("Character is Frodo");
        }
    }
}
