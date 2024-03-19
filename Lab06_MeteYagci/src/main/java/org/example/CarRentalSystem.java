package org.example;
import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    public static void main(String[] args) {
        LuxuryVehicle luxuryCar = new LuxuryVehicle("BMW", "X5", "abc", true, true);
        EconomyVehicle economyCar = new EconomyVehicle("Toyota", "Corolla", "asd", false);

        List<RentalRecord> rentalRecords = new ArrayList<>();
        rentalRecords.add(new RentalRecord(luxuryCar, 7, "Mete Yagci"));
        rentalRecords.add(new RentalRecord(economyCar, 5, "Ecem Onukar "));

        for (RentalRecord record : rentalRecords) {
            System.out.println("Lessor: " + record.getLessorIdentity());
            System.out.println("Vehicle: " + record.getVehicle().getBrand() + " " + record.getVehicle().getModel());
            System.out.println("License Plate: " + record.getVehicle().getLicensePlate());
            System.out.println("Rental Price: $" + record.getRentalPrice());
            System.out.println("Rental Period: " + record.getRentalPeriod() + " days\n");
        }
    }
}
