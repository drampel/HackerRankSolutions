package Java.Advanced;

import java.util.Scanner;

/* For Java 7 and Java 8, just add the six classes below. */
class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}

public class CovariantReturnTypes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String regionName = scan.next();
            Region region = regionName.equalsIgnoreCase("WestBengal") ? new WestBengal()
                    : (regionName.equalsIgnoreCase("AndhraPradesh") ? new AndhraPradesh() : new Region());
            Flower flower = region.yourNationalFlower();
            System.out.println(flower.whatsYourName());
        }
    }
}