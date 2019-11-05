// file: Latte.java

// 拿铁
public class Latte implements Coffee {

    public static Double price = 100.00;

    public Latte() {
        this.price = price;
    }

    @Override
    public double cost() {
        return this.price;
    }
    
}