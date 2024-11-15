public class Item { 
    private String name; 
    private int quantity; 
    private double price; 
 
    public Item(String name, int quantity, double price) { 
        this.name = name; 
this.quantity = quantity; 
this.price = price; 
} 
public void displayDetails() { 
System.out.println("Item: " + name + ", Quantity: " + quantity + ", Price: $" + price); 
} 
public String getName() { return name; } 
public int getQuantity() { return quantity; } 
public void setQuantity(int quantity) { this.quantity = quantity; } 
public double getPrice() { return price; } 
public void setPrice(double price) { this.price = price; } 
}
