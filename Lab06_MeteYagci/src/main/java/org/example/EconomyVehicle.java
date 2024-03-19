package org.example;

public class EconomyVehicle extends Vehicle{
    private boolean isHybrid;

    /**
     * Constructs a new EconomyVehicle object with the given details.
     *
     * @param brand        the brand of the vehicle
     * @param model        the model of the vehicle
     * @param licensePlate the license plate of the vehicle
     * @param isHybrid     indicates whether the vehicle is a hybrid
     */
    public EconomyVehicle(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }
    /**
     * Calculates the rental price for the vehicle for the given number of days.
     *
     * @param days the number of days for the rental
     * @return the total rental price for the vehicle
     */
    @Override
    public double calculateRentalPrice(int days) {
        double basePrice = 50;
        if (isHybrid) {
            basePrice += 10;
        }
        return basePrice;
    }
}
