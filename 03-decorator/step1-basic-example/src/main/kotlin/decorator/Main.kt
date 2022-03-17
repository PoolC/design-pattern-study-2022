package decorator

import decorator.cafe.*

fun main() {
    val b = MilkDecorator(
        MilkDecorator(
            WhipDecorator(
                MilkDecorator(
                    Espresso()
                )
            )
        )
    )

    println(b.cost())
    println(b.getDescription())
}