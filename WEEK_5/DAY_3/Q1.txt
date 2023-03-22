import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class Student {

    private String name;

    private int registrationNo;

    public Student(String name, int registrationNo) {

        this.name = name;

        this.registrationNo = registrationNo;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1) {

            String name = scanner.next();

            int registrationNo = -1;

            while (registrationNo < 0) {

                registrationNo = scanner.nextInt();

                if (registrationNo < 0) {

                    System.out.println("RegistrationNo should be positive value.");

                }

            }

            Student student = new Student(name, registrationNo);

            System.out.println(student.name + "," + student.registrationNo);

        } else if (choice == 2) {

            Student student = new Student(null, 0);

            System.out.println(student.name + "," + student.registrationNo);

        } else {

            System.out.println("Wrong Choice");

        }

    }

}