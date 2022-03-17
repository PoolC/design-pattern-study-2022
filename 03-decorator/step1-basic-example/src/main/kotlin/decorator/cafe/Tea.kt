package decorator.cafe

private const val PRICE = 2000

class Tea : Beverage() {
    override fun cost(): Int {
        return PRICE
    }
}
