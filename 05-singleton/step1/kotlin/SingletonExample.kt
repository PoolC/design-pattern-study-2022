package step1
/*
Step 1은 기본적인 Singleton 패턴에 대해 다룹니다.
 */

/* 코틀린은 언어적인 차원에서 object 키워드를 제공해 Lazy Initialize와 Multi-Thread 문제를 해결해준다
object SingletonExample {
    var value = 0f

    fun Do() {
        println("this is singleton which has value : $value")
    }
}
 */

class SingletonExample{
    companion object {
        private var instance: SingletonExample? = null

        fun getInstance() = instance ?: SingletonExample().also { instance = it }
    }
    var value = 0f

    fun Do() {
        println("this is singleton which has value : $value")
    }
}