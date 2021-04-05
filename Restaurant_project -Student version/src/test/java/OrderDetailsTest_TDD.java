import org.junit.jupiter.api.*;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class OrderDetailsTest_TDD {
    RestaurantService service = new RestaurantService();
    Restaurant restaurant =new Restaurant("Amelie's cafe","Chennai",LocalTime.parse("10:30:00"),LocalTime.parse("22:00:00"));

    //TDD - Part 3: Failing test case
        //When items are added the order total should be incremented accordingly
        //It should increment and decrement and displayed

    //Fucntion addCost(), removeCost() and totalCost() is implemented in Restaurant class
    @Test
    public void when_an_item_is_added_its_cost_should_be_added_into_total_cost(){
        restaurant.addToMenu("Pizza",200);
        restaurant.addToMenu("Burger",100);
        restaurant.addToMenu("Cold drink",50);

        restaurant.addCost("Burger");
        restaurant.addCost("Burger");
        restaurant.addCost("Pizza");
        assertEquals(400,restaurant.totalCost());
    }

    @Test
    public void when_an_item_is_removed_its_cost_should_be_deducted_from_total_cost(){
        restaurant.addToMenu("Pizza",200);
        restaurant.addToMenu("Burger",100);
        restaurant.addToMenu("Cold drink",50);

        restaurant.addCost("Burger");
        restaurant.addCost("Pizza");
        restaurant.removeCost("Burger");
        restaurant.removeCost("Cold drink");
        assertEquals(200,restaurant.totalCost());
    }

}
