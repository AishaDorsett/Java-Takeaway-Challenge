package Takeaway;

import org.hamcrest.core.StringStartsWith;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 


public class TakeawayTest {
    @Test public void testListOfDishes() {
        Takeaway takeaway = new Takeaway();
        assertNotNull(takeaway.listOfDishes());
      }

    @Test public void testPlaceOrder() {
        Takeaway takeaway = new Takeaway();
        assertEquals(takeaway.placeOrder("chips", "lamb chops"), 
        "You have ordered: chips and lamb chops. Your total is: £18.98");
    }

    @Test public void testOrderDelivery() {
        Takeaway takeaway = new Takeaway();
        assertTrue(takeaway.orderDelivery().startsWith("Thank you for placing your order. It will be delivered by"));
    }
}
