package decorator.cafe

class Empty: Beverage() {
    override fun cost(): Int {
        return 0
    }
}