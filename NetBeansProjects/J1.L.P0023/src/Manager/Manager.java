package Manager;

import Entity.Fruit;
import Entity.Order;
import java.util.ArrayList;

/**
 *
 * @author thinh
 */
public class Manager {

    public static int menu() {
        System.out.println("FRUIT SHOP SYSTEM");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputLimit(1, 4);
        return choice;
    }

    public static void createFruit(ArrayList<Fruit> listFruit) {
        String newId, newOrigin, newName;
        int newQuantity, newPrice;
        while (true) {
            while (true) {
                System.out.print("Enter fruit Id: ");
                newId = Validate.checkString();
                if (!Validate.checkExistedByid(newId, listFruit)) {
                    break;
                }
                System.out.println("Enter again: ");
            }
            while (true) {
                System.out.print("Enter fruit name: ");
                newName = Validate.checkString();
                if (!Validate.checkExistedByName(newName, listFruit)) {
                    break;
                }
                System.out.println("Enter again: ");
            }

            System.out.print("Enter new price: ");
            newPrice = Validate.checkInputInteger();

            System.out.print("Enter new Quantity: ");
            newQuantity = Validate.checkInputInteger();

            System.out.print("Enter new Origin: ");
            newOrigin = Validate.checkString();
            listFruit.add(new Fruit(newId, newName, newPrice, newQuantity, newOrigin));

            System.out.println("Do you want to continue? (Y/N)");
            String yesNo = Validate.checkYesNo();
            if (yesNo.equalsIgnoreCase("N")) {
                return;
            }
        }
    }

    public static void viewOrder(ArrayList<Order> listOrder) {
        for (Order order : listOrder) {
            System.out.println(order.getCustomerName());
            System.out.println(order);
        }
    }

    public static void shopping(ArrayList<Order> listOrder, ArrayList<Fruit> listFruit) {
        int item, quantity;
        System.out.println("Enter Customer name: ");
        String customerName = Validate.checkString();
        ViewFruit(listFruit);
        Order newOrder = new Order(customerName);
        while (true) {
            System.out.println("Enter your item: ");
            item = Validate.checkInputLimit(1, listFruit.size());
            if (listFruit.get(item - 1).getQuatity() == 0) {
                System.out.println("Sold out.");
                continue;
            }
            System.out.println("Enter your quantity: ");
            quantity = Validate.checkInputLimit(1, listFruit.get(item - 1).getQuatity());
            newOrder.addOrder(listFruit.get(item - 1), quantity);
            System.out.println(newOrder);
            System.out.println("Do you want continue? (Y/N)");
            String yesNo = Validate.checkYesNo();
            if (yesNo.equalsIgnoreCase("N")) {
                break;
            }
        }
        listOrder.add(newOrder);
    }

    private static void ViewFruit(ArrayList<Fruit> listFruit) {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Item", "Fruit Name", "Origin", "Price");
        int i = 0;
        for (Fruit fruit : listFruit) {
            i++;
            System.out.printf("%-15d%-15s%-15s%-15d\n", i, fruit.getName(), fruit.getOrigin(), fruit.getPrice());
        }
    }
}
