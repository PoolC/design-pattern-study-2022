package step2

class MultiThreadCaller : Thread(){

    override fun run() {
        SingletonExample.getInstance().Do()
        SingletonExample.getInstance().Interact(this)
    }
}