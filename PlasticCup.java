/**
 * PlasticCup.java
 * 塑料杯装饰器类
 */

public class PlasticCup implements Coffee {

    Coffee coffee;
    Double price = 9.00;

    public PlasticCup(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {

        return this.coffee.cost() + price;

    }

}
