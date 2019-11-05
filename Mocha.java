// file: Mocha.java

// 摩卡
public class Mocha implements Coffee {

    public static Double price = 120.00;

    public Mocha() {
        this.price = price;
    }

    @Override
    public double cost() {
        return this.price;
    }
    
}