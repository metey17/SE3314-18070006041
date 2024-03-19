package org.example;

public class LuxuryVehicle extends Vehicle{
     private boolean hasGPS;
    private boolean hasLeatherSeats;

    /**
     * Constructs a new LuxuryVehicle object with the given details.
     *
     * @param brand           the brand of the vehicle
     * @param model           the model of the vehicle
     * @param licensePlate    the license plate of the vehicle
     * @param hasGPS          indicates whether the vehicle has GPS
     * @param hasLeatherSeats indicates whether the vehicle has leather seats
     */
    public LuxuryVehicle(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }
    /**
     * Calculates the rental price for the vehicle for the given number of days.
     *
     * @param days the number of days for the rental
     * @return the total rental price for the vehicle
     */
    public double calculateRentalPrice(int days) {
        double basePrice = 100;
        double additionalFees = 0;
        if (hasGPS) {
            additionalFees += 20;
        }
        if (hasLeatherSeats) {
            additionalFees += 30;
        }
        return basePrice + additionalFees;
    }
}
