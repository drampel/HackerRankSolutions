package Java.DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Learner {
    private final int id;
    private final String name;
    private final double cgpa;

    public Learner(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }
}

class LearnerComparator implements Comparator<Learner> {
    @Override
    public int compare(Learner learner1, Learner learner2) {
        return Double.compare(learner2.getCgpa(), learner1.getCgpa()) != 0
                ? Double.compare(learner2.getCgpa(), learner1.getCgpa())
                : (learner1.getName().compareTo(learner2.getName()) != 0
                ? learner1.getName().compareTo(learner2.getName())
                : Integer.compare(learner1.getId(), learner2.getId()));
    }
}

public class JavaSort {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine());
            if (n >= 2) {
                List<Learner> learnerList = new ArrayList<>();
                while (n-- > 0) {
                    int id = scan.nextInt();
                    String name = scan.next();
                    double cgpa = Double.parseDouble(scan.nextLine());
                    if (id > 0 && cgpa >= 0) {
                        int existingId = 0;
                        for (Learner learner : learnerList) {
                            if (learner.getId() == id) existingId++;
                        }
                        if (existingId == 0) learnerList.add(new Learner(id, name, cgpa));
                    }
                }
                Collections.sort(learnerList, new LearnerComparator());
                for (Learner learner : learnerList) System.out.println(learner.getName());

                /* For Java 8 and Java 15, the commented-out comparator below can be used
                   instead of the top two lines and the LearnerComparator class. */

//                learnerList.stream().sorted(Comparator.comparingDouble(Learner::getCgpa)
//                                .reversed()
//                                .thenComparing(Learner::getName)
//                                .thenComparing(Learner::getId))
//                        .map(Learner::getName)
//                        .forEach(System.out::println);
            }
        }
    }
}