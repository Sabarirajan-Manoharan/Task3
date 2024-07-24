package Task3;

public class Employee implements Taxable{

    private int EmpID;
    private String name;
    private double salary;

    public Employee(int EmpID, String name, double salary) {
        this.EmpID = EmpID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return (salary / 100) * incomeTax;
    }

    public void displayEmp(){
        System.out.println("Employee ID --> "+EmpID);
        System.out.println("Name --> "+name);
        System.out.println("Salary --> "+salary);
        System.out.println("Income tax for above Salary --> " + calcTax());
    }
}
