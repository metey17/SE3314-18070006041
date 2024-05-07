package org.example;

/**
 * The MiddleEarthMap class represents a map of Middle Earth, providing navigation between different locations.
 */
public class MiddleEarthMap {
    /**
     * Constructs a MiddleEarthMap object.
     */
    public MiddleEarthMap() {

    }

    /**
     * Navigates to the specified location in Middle Earth.
     *
     * @param location the destination location
     */
    public void navigate(final String location) {
        boolean isSecretPassage = false;

        if (location.equals("Mordor")) {
            System.out.println("Navigating to Mordor");
            if (isSecretPassage) {
                System.out.println("Taking a secret passage");
            }
        } else if (location.equals("Shire")) {
            System.out.println("Navigating to the Shire");
            // Fall through to Gondor
            System.out.println("Navigating to Gondor");
        } else if (location.equals("Gondor")) {
            System.out.println("Navigating to Gondor");
        } else if (location.equals("Rohan")) {
            System.out.println("Navigating to Rohan");
        } else if (location.equals("Lothlórien")) {
            System.out.println("Navigating to Lothlórien");
        } else {
            System.out.println("Unknown location");
        }

        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
