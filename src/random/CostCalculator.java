package random;
import java.util.ArrayList;
import java.util.Scanner;

class Input{
    ArrayList<String> name = new ArrayList<>(5);
    ArrayList<String> type = new ArrayList<>(5);
    ArrayList<Float> tax = new ArrayList<>(5);
    ArrayList<Integer> quantity = new ArrayList<>(5);
    ArrayList<Integer> price = new ArrayList<>(5);
    ArrayList<Float> Fprice = new ArrayList<>(5);
}

public class CostCalculator {
    public static void main(String[] args) {
        Input a = new Input();
        Scanner s = new Scanner(System.in);
        boolean i = true;
        while(i){
                System.out.println("Enter the details of item:");
                System.out.print("Name:");
                String name = s.next();
                a.name.add(name);
                System.out.print("Price:");
                int price = s.nextInt();
                a.price.add(price);
                System.out.print("Quantity:");
                int quantity = s.nextInt();
                a.quantity.add(quantity);
                System.out.println("Select the type of item:");
                System.out.println("Press 1 for Raw");
                System.out.println("Press 2 for Manufactured");
                System.out.println("Press 3 for Imported");
                System.out.print("Enter your choice:");
                int j = s.nextInt();
                float tax = 0;
                switch (j){
                    case 1: a.type.add("Raw");
                            tax = (float)(price * 0.125);
                            a.tax.add(tax);
                            break;
                    case 2: a.type.add("Manufactured");
                        tax = (float)((price * 0.125)+0.02*(price + (price*0.125)));
                        a.tax.add(tax);
                        break;
                    case 3:a.type.add("Imported");
                        tax = (float)((price*0.10) + (price * 0.125));
                        a.tax.add(tax);
                        break;
                    default:a.name.removeLast();
                            a.price.removeLast();
                            a.quantity.removeLast();
                            System.out.println("Wrong Choice do the whole process again");
                            break;
                }
                float FP = (price + tax) * quantity;
                float surcharge = 0;
                if(a.type.equals("Imported")){
                    surcharge=(float)((FP<100)?5:(FP>200)?(0.05*FP):10);
                }
                FP = FP + surcharge ;
                a.Fprice.add(FP);
                System.out.println("Do you want to enter details of any other item (y/n)");
                String choice = s.next();
                if(choice.equals("n")){
                    i=false;
                }
            }
        System.out.println("List of item and price :");
        for (int j = 0; j < a.name.size() ; j++) {
            System.out.printf(" Name : %s \n Price per item : %d \n Type : %s \n Tax : %.2f \n Final Price : %.2f ",a.name.get(j),
                    a.price.get(j),a.type.get(j),a.tax.get(j),a.Fprice.get(j));
        }
    }
}
