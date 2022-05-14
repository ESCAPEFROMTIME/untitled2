/**
 * @author shkstart
 * @create 2022- 05-13-20:42
 */
public class Fruit {

    //水果名字
    private String name;
    //水果价格
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Fruit() {
    }
}
