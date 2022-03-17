package decorator.cafe

private const val PRICE = 1000

class MilkDecorator(private val beverage: Beverage) : BeverageDecorator(beverage) {
    override fun getDescription(): List<String> {
        return this.beverage.getDescription() + arrayListOf("milk")
    }

    override fun cost(): Int {
        return this.beverage.cost() + PRICE
    }
}