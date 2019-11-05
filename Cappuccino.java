// file: Cappuccino.java

// 卡布奇诺
public class Cappuccino implements Coffee {

    public static Double price = 150.00;

    public Cappuccino() {
        this.price = price;
    }

    // 实现基类的计算咖啡费用方法
    @Override
    public double cost() {

        return this.price;

    }
    
}