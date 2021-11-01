package Takeaway;

import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 

public class Takeaway {

    public Hashtable<String, Double> listOfDishes() {
        Hashtable<String, Double> dishes = new Hashtable<String, Double>();
        dishes.put("chips", 3.99);
        dishes.put("lamb chops", 14.99);
        dishes.put("pork ribs", 11.99);
        dishes.put("salad", 5.99);
        dishes.put("soft drink", 1.99);

        return dishes;
    }

    public String placeOrder(String item1, String item2) {

        Double item_selected = this.listOfDishes().get(item1);
        Double second_item_selected = this.listOfDishes().get(item2);

        return "You have ordered: " + item1 + " and " + item2 + ". Your total is: £"
        + (item_selected + second_item_selected)
        ; 
    }

    public String orderDelivery() {
        LocalTime time = LocalTime.now().plusMinutes(45);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = time.format(myFormatObj);
        
        return "Thank you for placing your order. It will be delivered by " + formattedTime;
    }

    public static void main(String[] args) {
        System.out.println(new Takeaway().listOfDishes());
        System.out.println(new Takeaway().placeOrder("chips", "soft drink"));
        System.out.println(new Takeaway().orderDelivery());

    }
}