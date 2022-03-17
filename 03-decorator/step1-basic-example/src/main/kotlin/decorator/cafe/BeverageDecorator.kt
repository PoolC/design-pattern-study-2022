package decorator.cafe

abstract class BeverageDecorator(private val beverage: Beverage) : Beverage() {
    abstract override fun getDescription(): List<String>
}
