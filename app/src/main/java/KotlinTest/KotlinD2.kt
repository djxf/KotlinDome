package KotlinTest


/**
 * 函数式编程
 *
 */


//Kotlin默认参数
fun test(a: Int = 0, b: Int = 1): Unit = println(a - b)

fun main() {
    test3(100,200) { x, y ->
        println(x * y)
    }

    test3 { x, y ->
        println(x - y)
    }
}

/**
 *对于重写方法来说，子类所拥有的重写方法会使用与父类相同的默认参数。
 * 在重写一个拥有默认参数的方法时。方法签名中必须要将默认参数值省略掉。
 *
 */

open class A {
    open fun method(a: Int, b: Int = 4) = a + b
}

class B : A() {
    override fun method(a: Int, b: Int): Int {
       return a + b
    }
}

//如果一个默认参数位于其他无默认值前面，那么默认值只能通过在调用函数时使用具名参数的方式来使用。
//最后一个参数是lambda表达式除外。
fun test2(a: Int = 1, b: Int) = a - b

fun test3(a: Int = 1, b: Int = 2, compute: (x: Int,y: Int) -> Unit) {
    compute(a,b)
}

fun main2(){
    //只能具名参数
    test2(b = 2)
}