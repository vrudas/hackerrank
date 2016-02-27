package domains.java.datastructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by vrudas on 2/27/2016.
 *
 * @see <a href="https://www.hackerrank.com/challenges/java-sort">HackerRank | Java | Collections | Java Sort</a>
 */
class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        IntStream.range(0, testCases)
                .forEach(i -> {
                    int id = in.nextInt();
                    String fname = in.next();
                    double cgpa = in.nextDouble();

                    Student st = new Student(id, fname, cgpa);
                    studentList.add(st);
                });

        studentList.stream()
                .sorted(Comparator
                        .comparing(Student::getCgpa)
                        .reversed()
                        .thenComparing(Student::getFname)
                )
                .forEach(student -> System.out.println(student.getFname()));
    }
}

