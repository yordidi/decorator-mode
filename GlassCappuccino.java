// file: GlassCappuccino.java

// 玻璃杯卡布奇诺
public class GlassCappuccino implements Coffee {

    Double price = 10.00;

    public GlassCappuccino() {
        this.price = price;
    }

    // 实现基类的计算咖啡费用方法
    @Override
    public double cost() {

        return this.price + Cappuccino.price;

    }
    
}