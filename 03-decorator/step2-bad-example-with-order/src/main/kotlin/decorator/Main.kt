package decorator

import decorator.cafe.*

fun main() {
    val b =
        MilkDecorator(
            PrettyPrintDecorator(
                MilkDecorator(
                    WhipDecorator(
                        MilkDecorator(
                            Espresso()
                        )
                    )
                )
            )
        )

    println(b.getDescription())
}