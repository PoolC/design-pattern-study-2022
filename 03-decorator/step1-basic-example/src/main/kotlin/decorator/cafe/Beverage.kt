package decorator.cafe

abstract class Beverage {
    abstract fun getDescription(): List<String>
    abstract fun cost(): Int
}
