/**
 * @author shkstart
 * @create 2022- 05-13-23:25
 */
public class Test {
    public static void main(String[] args) {

        // 1.超市出售苹果和草莓

        SuperMarket superMarket = new SuperMarket();


        superMarket.addFruit("apple",8.0);
        superMarket.addFruit("strawberry",20.0);

        //顾客购买随意数量的水果
        Customer customer = new Customer();
        customer.selectFruit("apple",5);
        customer.selectFruit("strawberry",2);

        //购买商品的总价
        System.out.println(customer.buy());
        System.out.println("*************************************");




        //2.超市出售苹果草莓芒果
        superMarket.addFruit("mango",20.0);

        //顾客购买随意数量的水果
        customer.selectFruit("mango",5);
        customer.selectFruit("apple",4);
        customer.selectFruit("strawberry",3);

        //总价：
        System.out.println(customer.buy());
        System.out.println("*************************************");


        //3.超市做促销活动，草莓限时打 8 折
        superMarket.discountSale("strawberry",8);
        //顾客购买随意数量的水果
        customer.selectFruit("mango",7);
        customer.selectFruit("apple",5);
        customer.selectFruit("strawberry",5);

        //总价：
        System.out.println(customer.buy());
        System.out.println("*************************************");


        //4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
        //满减活动,满100-10，满200-30,满300-60

        superMarket.bigSale(100,10);
        superMarket.bigSale(200,30);
        superMarket.bigSale(300,60);





        //顾客购买随意数量的水果
        customer.selectFruit("mango",7);
        customer.selectFruit("apple",5);
        customer.selectFruit("strawberry",5);
        //总价：
        System.out.println(customer.buy());
        System.out.println("*************************************");
    }
}
