package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CarRentalSystemTest {
    @Test
    public void testRentalRecordCreation() {
        LuxuryVehicle luxuryCar = new LuxuryVehicle("BMW", "X5", "abc", true, true);
        RentalRecord rentalRecord = new RentalRecord(luxuryCar, 7, "Mete Yagci");

        assertEquals(luxuryCar, rentalRecord.getVehicle());
        assertEquals(7, rentalRecord.getRentalPeriod());
        assertEquals("Mete Yagci", rentalRecord.getLessorIdentity());
        assertEquals(150.0, rentalRecord.getRentalPrice());
    }
}
