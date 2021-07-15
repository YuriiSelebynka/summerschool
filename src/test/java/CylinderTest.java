import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest {

    Cylinder cylinder = new Cylinder(4,4);

    @Test
    public void whenH4AndR4ThenDiameterOfBase8() {
        assertEquals(8, cylinder.getDiameterOfBase(), 0.1);
    }

    @Test
    public void whenH4AndR4ThenLengthOfBase25() {
        assertEquals(25.1, cylinder.getLengthOfBase(), 0.1);
    }

    @Test
    public void whenH4AndR4ThenSideSurfaceArea100() {
        assertEquals(100.5, cylinder.getSideSurfaceArea(), 0.1);
    }

    @Test
    public void whenH4AndR4ThenAreaOfBase50() {
        assertEquals(50.2,cylinder.getAreaOfBase(), 0.1);
    }

    @Test
    public void whenH4AndR4ThenTotalArea201() {
        assertEquals(201,cylinder.getTotalArea(), 0.1);
    }

    @Test
    public void whenH4AndR4ThenVolume201() {
        assertEquals(201,cylinder.getVolume(), 0.1);
    }
}