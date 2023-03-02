package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

enum Event {
    ENTER, SERVED
}

class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
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

    @Override
    public int compareTo(Student student) {
        return Double.compare(student.getCgpa(), this.getCgpa()) != 0
                ? Double.compare(student.getCgpa(), this.getCgpa())
                : (this.getName().compareTo(student.getName()) != 0
                ? this.getName().compareTo(student.getName())
                : Integer.compare(this.getId(), student.getId()));
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        Queue<Student> queueStudents = new PriorityQueue<>();
        for (String event : events) {
            String[] eventData = event.split(" ");
            try {
                switch (Event.valueOf(eventData[0].toUpperCase())) {
                    case ENTER: {
                        if (Integer.parseInt(eventData[3]) >= 1 && Double.parseDouble(eventData[2]) >= 0) {
                            int existingId = 0;
                            for (Student student : queueStudents) {
                                if (student.getId() == Integer.parseInt(eventData[3])) existingId++;
                            }
                            if (existingId == 0) queueStudents.offer(new Student(Integer.parseInt(eventData[3]),
                                    eventData[1], Double.parseDouble(eventData[2])));
                        }
                        break;
                    }
                    case SERVED: {
                        queueStudents.poll();
                        break;
                    }
                }
            } catch (IllegalArgumentException ignored) {
            }
        }
        List<Student> unservedStudents = new ArrayList<>();
        while (!queueStudents.isEmpty()) unservedStudents.add(queueStudents.poll());
        return unservedStudents;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            if (totalEvents >= 2) {
                List<String> events = new ArrayList<>();
                while (totalEvents-- > 0) events.add(scan.nextLine());
                List<Student> students = new Priorities().getStudents(events);
                if (students.isEmpty()) System.out.println("EMPTY");
                else for (Student student : students) System.out.println(student.getName());
            }
        }
    }
}