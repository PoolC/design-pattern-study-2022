package decorator.cafe

private const val PRICE = 1500

class WhipDecorator(private val beverage: Beverage) : BeverageDecorator(beverage) {
    override fun getDescription(): List<String> {
        return this.beverage.getDescription() + "whip"
    }

    override fun cost(): Int {
        return this.beverage.cost() + PRICE
    }
}
