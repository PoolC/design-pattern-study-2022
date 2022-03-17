package decorator.cafe

private const val PRICE = 1500

class WhipDecorator(private val beverage: Beverage) : BeverageDecorator() {
    private var count = 3

    override fun getDescription(): List<String> {
        return this.beverage.getDescription() + "whip"
    }

    override fun cost(): Int {
        if (count == 0) {
            return this.beverage.cost()
        }

        count--
        return this.beverage.cost() + PRICE
    }
}