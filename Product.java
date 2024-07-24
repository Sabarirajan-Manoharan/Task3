package Task3;

public class Product implements Taxable{
    private int pid;
    private double price;
    private double quantity;

    public Product(int pid, double price, double quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return ((price*quantity) / 100) * salesTax;
    }

    public void displayProduct(){
        System.out.println("Product ID--> "+pid);
        System.out.println("Price --> "+price);
        System.out.println("Quantity --> "+quantity);
        System.out.println("Sales tax for above Product --> " + calcTax());
    }
}
