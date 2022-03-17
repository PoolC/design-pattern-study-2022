package decorator

import decorator.cafe.*

fun main() {
    var b: Beverage = MilkDecorator(
        WhipDecorator(
            MilkDecorator(
                Espresso()
            )
        )
    )

    println(b.cost())
    println(b.getDescription())
}
