import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author shkstart
 * @create 2022- 05-13-20:41
 */
public class SuperMarket {

    //满减活动信息
    private static final Map<Integer,Integer> payAndDiscount = new HashMap<>();

    //水果摊
    private static final Map<String,Fruit> fruitStand = new HashMap<>();



    public static Map getPayAndDiscount(){

        return payAndDiscount;

    }

    public static Map getFruitStand(){

        return fruitStand;

    }


    //增加出售的水果
    public  void addFruit(String anyFruit, Double fruitPrice){

        Fruit fruit = new Fruit(anyFruit, fruitPrice);

        fruitStand.put(anyFruit,fruit);

    }


    //打折促销
    public void discountSale(String anyFruit,int discount){

        Fruit fruit = fruitStand.get(anyFruit);

        double v = fruit.getPrice() * discount * 0.1;

        fruit.setPrice(v);

        fruitStand.put(anyFruit,fruit);

    }

    //满减活动
    public void bigSale(Integer pay,Integer discount){

        payAndDiscount.put(pay,discount);

    }


    //清除所有满减
    public void normalSale(){

        payAndDiscount.clear();

    }


    //清空库存
    public void emptyInventory(){

        fruitStand.clear();

    }



}
