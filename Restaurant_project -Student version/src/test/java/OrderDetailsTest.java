import org.junit.jupiter.api.*;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class OrderDetailsTest {
    RestaurantService service = new RestaurantService();
    Restaurant restaurant =service.addRestaurant("Amelie's cafe","Chennai",LocalTime.parse("10:30:00"),LocalTime.parse("22:00:00"));

    //TDD - Part 3: Failing test case
        //When items are added the order total should be incremented accordingly
        //It should increment and decrement and displayed


    @Test
    public void when_an_item_is_added_its_cost_should_be_added_into_total_cost(){

    }

    @Test
    public void when_an_item_is_removed_its_cost_should_be_deducted_from_total_cost(){

    }

}
