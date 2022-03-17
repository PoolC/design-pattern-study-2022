package decorator

import decorator.cafe.*

fun main() {
    val beverage = PrettyPrintDecorator(
        MilkDecorator(
            WhipDecorator(
                MilkDecorator(
                    Espresso()
                )
            )
        )
    )

    println(beverage.cost())
    println(beverage.getDescription())
}
