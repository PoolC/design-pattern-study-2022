package decorator.cafe

private const val PRICE = 4000

class Espresso : Beverage() {
    override fun getDescription(): List<String> {
        return arrayListOf("Super delicious espresso")
    }

    override fun cost(): Int {
        return PRICE
    }
}
