package decorator.cafe

import kotlin.streams.toList

class PrettyPrintDecorator(private val beverage: Beverage) : BeverageDecorator(beverage) {
    override fun cost(): Int {
        return this.beverage.cost()
    }

    override fun getDescription(): List<String> {
        val milkCount = this.beverage.getDescription().stream()
            .filter { it == "milk" }
            .count()

        val bev = this.beverage.getDescription().stream()
            .filter { it != "milk" }
            .toList()

        return listOf(bev.joinToString(", ") + ", " + milkCount + " milk")
    }
}