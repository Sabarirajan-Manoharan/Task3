package Task3;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee information from user
        System.out.println("Enter employee details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Yearly Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee emp = new Employee(empId, name, salary);
        // Display employee details and calculated tax
        emp.displayEmp();

        // Accept product information from user
        System.out.println("\nEnter product details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Unit Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object
        Product prod = new Product(pid, price, quantity);
        // Display product details and calculated tax
        prod.displayProduct();
    }
}