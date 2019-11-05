/**
 * file: coffee.js
 */

 // 咖啡价格
const coffee = {
  Cappuccino: 150,
  Latte: 100,
  Mocha: 120,
};

// 杯子价格
const cup = {
  EcoCup: 8,
  Glass: 10,
  PlasticCup: 9,
};

// 组合咖啡费用
function cost (coffeeName, cupType) {
  const coffeeFee = coffee[coffeeName] || 0;
  const cupFee = cup[cupType] || 0;
  return coffeeFee + cupFee;
}
