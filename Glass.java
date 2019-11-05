/**
 * Glass.java
 * 玻璃杯装饰器类
 */

public class Glass implements Coffee {

    Coffee coffee;
    Double price = 10.00;

    public Glass(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {

        return this.coffee.cost() + price;

    }

}