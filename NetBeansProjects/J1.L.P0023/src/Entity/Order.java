
package Entity;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<OrderFruit> listFruit = new ArrayList<>();
    private int totalPrice = 0;
    
    static class OrderFruit{
        private String fruitId;
        private String fruitName;
        private int quatity;
        private int price;

        public OrderFruit() {
        }

        public void setFruitId(String fruitId) {
            this.fruitId = fruitId;
        }

        public void setFruitName(String fruitName) {
            this.fruitName = fruitName;
        }

        public void setQuatity(int quatity) {
            this.quatity = quatity;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public Order(String customerName) {
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public void addOrder(Fruit fruitOder, int quantity){
        OrderFruit newFruit = new OrderFruit();
        newFruit.setFruitName(fruitOder.getName());
        newFruit.setQuatity(quantity);
        newFruit.setFruitId(fruitOder.getId());
        newFruit.setPrice(fruitOder.getPrice());
        fruitOder.setQuatity(fruitOder.getQuatity() - quantity);
        if (checkExist(newFruit) >= 0){
            OrderFruit orderFruit = this.listFruit.get(checkExist(newFruit));
            orderFruit.setQuatity(quantity + orderFruit.quatity);
        }else
        {
            this.listFruit.add(newFruit);
        }
        setTotal(newFruit);
    }
    
    public int checkExist(OrderFruit newFruit){
        for (OrderFruit orderfruit:listFruit){
            if (orderfruit.fruitName.equalsIgnoreCase(newFruit.fruitName)){
                return listFruit.indexOf(orderfruit);
            }
        }
        return -1;
    }
    
    private void setTotal(OrderFruit newFruit){
        totalPrice += newFruit.price*newFruit.quatity;
    }

    @Override
    public String toString() {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Product","Quantity", "Price", "Amount");
        for (OrderFruit fruit : listFruit){
            System.out.printf("%-15s%-15d%-15d%-15d\n", fruit.fruitName, fruit.quatity, fruit.price, fruit.price * fruit.quatity);
        }
        System.out.println("Total: " + this.totalPrice);
        return "";
    }
}
