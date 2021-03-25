package KotlinTest

/**
 * 中缀函数  （infix notation）
 * 函数还可以通过中缀符号形式来调用，需要满足如下3个条件：
 *      1 是成员函数或是拓展函数
 *      2 拥有单个参数
 *      3 声明时使用infix关键字
 *
 */

class InfixTest(private var a: Int) {

    infix fun add(b: Int) = this.a + b

}

fun main() {
    val infixTest = InfixTest(2)

    println(infixTest.add(5))
    println(infixTest add 5)//中缀表达式
}

/**
 * 内联函数 (inline function)
 *
 *
 */
inline fun myCalcualte(a: Int, b: Int) {
    a + b
}

/**
 * 高阶函数：接受或返回另一个函数的函数称为高阶函数。
 *
 * Lambda表达式要求：
 *      1 一个lambda表达式总是被一对花括号所包围
 *      2 其参数(如果有的话)位于-->之前。（参数类型可以省略）
 *      3 执行体位于-->之后
 *
 *  Kotlin
 *
 *
 */

val multiply: (Int, Int) -> Int = {a, b -> a * b}
val add: (Int, Int) -> Int = { a, b -> a + b}
val subtract = { a: Int, b: Int -> a - b }
val myAction = { println("Hello World!") }
val mayReturnNull: (Int, Int) -> Int? = {_, _ -> null }
val funcitonMaybeNull: ((Int, Int) -> Int)? = null