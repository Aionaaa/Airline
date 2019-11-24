import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Iona", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Iona", passenger.getName());
    }

}
