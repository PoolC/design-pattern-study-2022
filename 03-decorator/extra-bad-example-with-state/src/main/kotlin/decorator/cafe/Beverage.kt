package decorator.cafe

abstract class Beverage {
    open fun getDescription(): List<String> {
        return ArrayList()
    }

    abstract fun cost(): Int
}
