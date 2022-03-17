package decorator

import decorator.cafe.*

fun main() {
    var b : Beverage = MilkDecorator(
        MilkDecorator(
            WhipDecorator(
                MilkDecorator(
                    Espresso()
                )
            )
        )
    )

    println(b.cost())

    b = WhipDecorator(b)
    println(b.cost())
    println(b.cost())
    println(b.cost())

    println(b.getDescription())
}
