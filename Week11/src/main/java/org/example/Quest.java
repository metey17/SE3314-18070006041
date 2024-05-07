package org.example;
/**
 * The Quest class represents an adventure or mission that characters can undertake in the "The Lord of the Rings" universe.
 */
public class Quest {
    /**
     * Constructor of quest.
     */
    public Quest() {


    }

    /**
     * Completes the quest based on the given points.
     *
     * @param points the points earned during the quest
     * @return true if the quest is successfully completed, false otherwise
     */
    public boolean completeQuest(final int points) {
        boolean isRingBearer = false;
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        return (points >= 100) ? true : false;
    }






}