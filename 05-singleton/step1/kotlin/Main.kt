package step1;

fun main(){
    SingletonExample.getInstance().Do()

    val caller1 = Caller()
    val caller2 = Caller()

    SingletonExample.getInstance().value = 10f

    caller1.Do()
    caller2.Do()

    SingletonExample.getInstance().value = 200f

    caller1.Do()
    caller2.Do()
}