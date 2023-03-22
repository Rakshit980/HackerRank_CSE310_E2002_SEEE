import java.util.Scanner;

class Employee {
    int id;
    int age;

    Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Invalid input");
            return;
        }
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            int age = scanner.nextInt();
            if (id < 10 || id > 1000 || age < 18 || age > 50) {
                System.out.println("Invalid data");
                return;
            }
            employees[i] = new Employee(id, age);
        }
        for (int i = 0; i < n; i++) {
            if (employees[i].age < 30) {
                System.out.println(employees[i].id + " " + employees[i].age);
            }
        }
    }
}