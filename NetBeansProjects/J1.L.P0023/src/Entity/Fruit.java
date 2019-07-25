
package Entity;

public class Fruit {
    private String id;
    private String name;
    private int price;
    private int quatity;
    private String origin;

    public Fruit() {
    }

    public Fruit(String id, String name, int price, int quatity, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quatity = quatity;
        this.origin = origin;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuatity() {
        return quatity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public static void getByName(){
        
    }
    
    public static void getById(){
        
    }
    
    @Override
    public String toString() {
        System.out.println("");
        return "";
    }
    
    
}
