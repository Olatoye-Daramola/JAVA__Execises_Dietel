package TryOuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike bmx = new Bike();

    @Test
    public void bikeCanBeTurnedOnTest() {
        bmx.turnOn(true);

        assertTrue(bmx.isOn());
    }

    @Test
    public void bikeCanBeTurnedOffTest() {
        bmx.turnOn(false);

        assertFalse(bmx.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedTest(){
        bmx.automaticGear(20);
        bmx.accelerateBike();

        assertEquals(21, bmx.getSpeed());
    }

    @Test
    public void bikeCanBeDeceleratedTest(){
        bmx.automaticGear(21);
        bmx.decelerateBike();

        assertEquals(19, bmx.getSpeed());
    }

    @Test
    public void getGearLevelTest(){
        bmx.automaticGear(10);
        System.out.printf("Gear at speed %d is %d%n", bmx.getSpeed(), bmx.getGear());
        bmx.automaticGear(20);
        System.out.printf("Gear at speed %d is %d%n", bmx.getSpeed(), bmx.getGear());
        bmx.automaticGear(21);
        System.out.printf("Gear at speed %d is %d%n", bmx.getSpeed(), bmx.getGear());
        bmx.automaticGear(30);
        System.out.printf("Gear at speed %d is %d%n", bmx.getSpeed(), bmx.getGear());
        bmx.automaticGear(31);
        System.out.printf("Gear at speed %d is %d%n", bmx.getSpeed(), bmx.getGear());
    }
}
