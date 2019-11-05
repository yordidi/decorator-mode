
// 测试代码
public class Shopping {
    public static void main(String[] args) {

        Coffee latte = new Latte();
        Coffee Cappuccino = new Cappuccino();

        // 实例化杯装拿铁
        Coffee latteGlass = new Glass(latte);
        Coffee lattePlasticCup = new PlasticCup(latte);
        Coffee latteEcoCup = new EcoCup(latte);

        // 实例化杯装卡不奇诺
        Coffee CappuccinoGlass = new Glass(Cappuccino);
        Coffee CappuccinoPlasticCup = new PlasticCup(Cappuccino);
        Coffee CappuccinoEcoCup = new EcoCup(Cappuccino);


        System.out.println("玻璃杯拿铁费用是");
        System.out.println(latteGlass.cost()); // 110

        System.out.println("塑料杯拿铁费用是");
        System.out.println(lattePlasticCup.cost()); // 109

        System.out.println("生态杯拿铁费用是");
        System.out.println(latteEcoCup.cost()); // 108

        System.out.println("玻璃杯卡布奇诺费用是");
        System.out.println(CappuccinoGlass.cost()); // 160

        System.out.println("生态杯卡布奇诺费用是");
        System.out.println(CappuccinoEcoCup.cost()); // 158

    }
}




