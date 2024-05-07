package org.example;

/**
 * Hello world!
 */
public final class App
{
    private App() {
    }

    /**
     * The main method of the application.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        Character legolas = new Character("Legolas", "Elf", 40);
        frodo.printDetails();
        legolas.printDetails();
        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor");

        Quest quest = new Quest();
        quest.completeQuest(100);
    }
}
