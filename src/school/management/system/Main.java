package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radek on 29/09/2020
 */

public class Main {
    public static void main(String[] args) {
        Teacher walter = new Teacher(1, "Walter", 500);
        Teacher gustavo = new Teacher(2, "Gustavo", 700);
        Teacher skyler = new Teacher(3, "Skyler", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(walter);
        teacherList.add(gustavo);
        teacherList.add(skyler);

        Student jessie = new Student(1, "Jessie", 4);
        Student jane = new Student(2, "Jane", 12);
        Student badger = new Student(3, "Badger", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jessie);
        studentList.add(jane);
        studentList.add(badger);

        School ghs = new School(teacherList, studentList);

        jessie.payFees(5000);
        // System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        jane.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----------- Making GHS PAY SALARY----------");
        walter.receiveSalary(walter.getSalary());
        System.out.println("GHS has spent for salary to " + walter.getName() + " and now has $"
                + ghs.getTotalMoneyEarned());

        gustavo.receiveSalary(skyler.getSalary());
        System.out.println("GHS has spent for salary to " + skyler.getName() + " and now has $"
                + ghs.getTotalMoneyEarned());

        System.out.println(jane);

        gustavo.receiveSalary(gustavo.getSalary());

        System.out.println(gustavo);

    }
}
