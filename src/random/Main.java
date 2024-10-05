package random;


import java.util.Scanner;
class Item {
    private String name;
    private double cost;
    private String type;

    public Item(String name, double cost, String type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public double calculateEffectiveCost() {
        double effectiveCost = 0.0;

        switch (type.toLowerCase()) {
            case "raw":
                effectiveCost = cost + (cost * 0.125);
                break;

            case "manufactured":
                double tax = cost * 0.125;
                effectiveCost = cost + tax + (0.02 * (cost + tax));
                break;

            case "imported":
                double importDuty = cost * 0.10;
                double totalCost = cost + importDuty;
                double surcharge = 0.0;

                if (totalCost <= 100) {
                    surcharge = 5;
                } else if (totalCost > 100 && totalCost <= 200) {
                    surcharge = 10;
                } else {
                    surcharge = 0.05 * totalCost;
                }

                effectiveCost = totalCost + surcharge;
                break;

            default:
                System.out.println("Invalid item type.");
                break;
        }

        return effectiveCost;
    }

    public void display() {
        System.out.println("Item Name: " + name);
        System.out.println("Item Cost: " + cost);
        System.out.println("Item Type: " + type);
        System.out.println("Effective Cost after Tax: " + calculateEffectiveCost());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the item cost: ");
        double cost = scanner.nextDouble();

        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter the item type (Raw, Manufactured, Imported): ");
        String type = scanner.nextLine();

        Item item = new Item(name, cost, type);
        item.display();
    }
}