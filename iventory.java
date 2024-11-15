import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
        Inventory inventory = new Inventory(); 
 
        // Predefined values and names 
        Item item1 = new Item("Laptop", 10, 800.00);
        Item item2 = new Item("Smartphone", 20, 500.00); 
        Item item3 = new Item("Headphones", 50, 30.00); 
 
        // Adding items to inventory 
        inventory.addItem(item1); 
        inventory.addItem(item2); 
        inventory.addItem(item3); 
 
        // Displaying inventory after predefined values are added 
        System.out.println("\nInitial Inventory:"); 
        inventory.displayInventory(); 
 
        Scanner scanner = new Scanner(System.in); 
 
        while (true) { 
            System.out.println("\nChoose an option:"); 
            System.out.println("1. Add Item\n2. Update Item\n3. Display Inventory\n4. Exit"); 
            int choice = scanner.nextInt(); 
            scanner.nextLine();  // Clear the buffer 
 
            switch (choice) { 
                case 1: 
                    System.out.println("Enter item name:"); 
                    String name = scanner.nextLine(); 
                    System.out.println("Enter quantity:"); 
                    int quantity = scanner.nextInt(); 
                    System.out.println("Enter price:"); 
                    double price = scanner.nextDouble(); 
                    inventory.addItem(new Item(name, quantity, price)); 
                    break; 
                case 2: 
                    System.out.println("Enter item name to update:"); 
                    String updateName = scanner.nextLine(); 
                    System.out.println("Enter new quantity:"); 
                    int newQuantity = scanner.nextInt(); 
                    System.out.println("Enter new price:"); 
                    double newPrice = scanner.nextDouble(); 
                    inventory.updateItem(updateName, newQuantity, newPrice); 
                    break; 
                case 3: 
                    System.out.println("Current Inventory:"); 
                    inventory.displayInventory(); 
                    break; 
                case 4: 
                    System.out.println("Exiting..."); 
                    return; 
                default: 
                    System.out.println("Invalid choice."); 
            } 
        } 
    } 
}
