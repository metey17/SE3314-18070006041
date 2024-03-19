package org.example;

abstract class Vehicle {
    private String brand;
    private String model;
    private String licensePlate;
    /**
     * Constructs a new Vehicle object with the given details.
     *
     * @param brand        the brand of the vehicle
     * @param model        the model of the vehicle
     * @param licensePlate the license plate of the vehicle
     */
    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }
    /**
     * Gets the brand of the vehicle.
     *
     * @return the brand of the vehicle
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the model of the vehicle.
     *
     * @return the model of the vehicle
     */
    public String getModel() {
        return model;
    }


    /**
     * Gets the license plate of the vehicle.
     *
     * @return the license plate of the vehicle
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Calculates the rental price for the vehicle for the given number of days.
     *
     * @param days the number of days for the rental
     * @return the total rental price for the vehicle
     */
    public abstract double calculateRentalPrice(int days);

}
