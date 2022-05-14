import com.sun.glass.utils.NativeLibLoader;

import java.util.*;

/**
 * @author shkstart
 * @create 2022- 05-13-20:42
 */
public class Customer {

    //水果袋，存储要买的水果
    private Map<String, Integer> fruitBag = new HashMap<>();

    private double totalPrice;

    public double buy() {

        totalPrice = 0;
        Iterator<String> iterator = fruitBag.keySet().iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            int fruitNum = fruitBag.get(next);
            Fruit fruit = (Fruit) SuperMarket.getFruitStand().get(next);
            double unitPrice = fruit.getPrice();
            totalPrice += fruitNum * unitPrice;
        }

        afterBigSale();

        return totalPrice;

    }

    private double afterBigSale(){

        //判断是否达到满减条件
        int discountStrength = 0;

        Map<Integer,Integer> payAndDiscount = SuperMarket.getPayAndDiscount();

        Set<Integer> pay = payAndDiscount.keySet();

        Iterator bigSale = pay.iterator();

        while (bigSale.hasNext()){

            if(totalPrice >= (Integer)bigSale.next()){
                discountStrength++;
            }
        }

        //选择符合条件的满减力度
        if (discountStrength != 0){
            Object[] payArray = pay.toArray();
            Arrays.sort(payArray);
            Integer integer = (Integer) payArray[discountStrength - 1];
            Integer o = payAndDiscount.get(integer);
            totalPrice = totalPrice - o ;
        }

        return totalPrice;
    }




    //挑选水果
    public void selectFruit(String anyfruit, int FruitNum) {


        fruitBag.put(anyfruit, FruitNum);


    }

    //清空购物袋
    public void emptyShoppingBag() {

        fruitBag.clear();

    }



}
