public class Invoice {
    public static class Line {
        String description;
        int quantity;
        float unitPrice;
        float total;
    
        public Line(String description, int quantity, float unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.total = quantity * unitPrice;
        }
        
        public void displayLine() {
            System.out.printf("| %-15s | %-10d | %-10.2f | %-10.2f |%n", description, quantity, unitPrice, total);
        }
    }
    
    public static class Details {
        String customer;
        String address;
        
        public Details(String customer, String address) {
            this.customer = customer;
            this.address = address;
        }
        
        public void displayDetails() {
            System.out.println("Customer: " + customer);
            System.out.println("Address: " + address);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("INVOICE");
        
        Details details = new Details("John Doe", "456 Another Street");
        details.displayDetails();
        
        System.out.printf("| %-15s | %-10s | %-10s | %-10s |%n", "Description", "Quantity", "Unit Price", "Total");
        System.out.println("----------------------------------------------------------");
        
        Line line1 = new Line("Item One", 1, 100);
        Line line2 = new Line("Item Two", 2, 50);
        Line line3 = new Line("Item Three", 3, 30);
        Line line4 = new Line("Item Four", 1, 200);
        
        line1.displayLine();
        line2.displayLine();
        line3.displayLine();
        line4.displayLine();
    }
}