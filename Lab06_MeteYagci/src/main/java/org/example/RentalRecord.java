package org.example;

public class RentalRecord {
    private Vehicle vehicle;
    private int rentalPeriod;
    private double rentalPrice;
    private String lessorIdentity;


    /**
     * Constructs a new RentalRecord object with the given details.
     *
     * @param vehicle        the rented vehicle
     * @param rentalPeriod   the rental period in days
     * @param lessorIdentity the identity of the lessor
     */
    public RentalRecord(Vehicle vehicle, int rentalPeriod, String lessorIdentity) {
        this.vehicle = vehicle;
        this.rentalPeriod = rentalPeriod;
        this.lessorIdentity = lessorIdentity;
        this.rentalPrice = vehicle.calculateRentalPrice(rentalPeriod);
    }

    /**
     * Gets the rented vehicle.
     *
     * @return the rented vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Gets the rental period in days.
     *
     * @return the rental period in days
     */
    public int getRentalPeriod() {
        return rentalPeriod;
    }


    /**
     * Gets the rental price.
     *
     * @return the rental price
     */
    public double getRentalPrice() {
        return rentalPrice;
    }

    /**
     * Gets the identity of the lessor.
     *
     * @return the identity of the lessor
     */
    public String getLessorIdentity() {
        return lessorIdentity;
    }


}
