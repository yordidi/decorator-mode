/**
 * EcoCup.java
 * 生态杯装饰器类
 */

public class EcoCup implements Coffee {

    Coffee coffee;
    Double price = 8.00;

    public EcoCup(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {

        return this.coffee.cost() + price;

    }

}
