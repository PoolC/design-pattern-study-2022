package step2

/*
object SingletonExample {
    var value = 0f

    fun Do() {
        println("this is singleton which has hash value : " + hashCode())
    }

    fun Interact(caller: MultiThreadCaller) {
        println("Singleton interact with $caller instance.")
    }
}
 */

class SingletonExample{
    companion object {
        private var instance: SingletonExample? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: SingletonExample().also { instance = it }
            }

    }
    var value = 0f

    fun Do() {
        println("this is singleton which has value : ${instance.hashCode()}")
    }

    fun Interact(caller: MultiThreadCaller) {
        println("Singleton interact with $caller instance.")
    }
}