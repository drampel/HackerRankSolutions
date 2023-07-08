package Java.Advanced;

import java.util.Scanner;

interface Food {
    String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        /* For Java 7 and Java 8, just add the bottom two lines to existing code. */
        return order.equalsIgnoreCase("cake") ? new Cake()
                : (order.equalsIgnoreCase("pizza") ? new Pizza() : null);

    }
}

public class JavaFactoryPattern {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            FoodFactory foodFactory = new FoodFactory();
            Food food = foodFactory.getFood(scan.nextLine());
            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        }
    }
}