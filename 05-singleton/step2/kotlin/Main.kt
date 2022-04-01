package step2

fun main(){
    val callers = ArrayList<MultiThreadCaller>()

    for (i in 0..9) {
        callers.add(MultiThreadCaller())
    }

    for (caller in callers) {
        caller.start()
    }
}
