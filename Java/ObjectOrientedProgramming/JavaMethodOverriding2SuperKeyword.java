package Java.ObjectOrientedProgramming;

public class JavaMethodOverriding2SuperKeyword {
    public static void main(String[] args) {
        new MotorCycle();
    }
}

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();    //For Java 7 and Java 8, just add this line to existing code.
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}