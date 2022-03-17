package decorator.cafe

abstract class BeverageDecorator : Beverage() {
    abstract override fun getDescription(): List<String>
}
