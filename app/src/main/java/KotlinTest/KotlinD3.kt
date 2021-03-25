package KotlinTest


/**
 * 显示返回类型
 * 拥有方法体的函数必须要显示指定返回类型
 * 除非函数返回Unit，这时候返回类型就可以省略掉。
 *
 * 一个方法中，只允许一个参数为vararg，通过作为最后一个参数。如果vararg不是最后参数，
 * 那么其后的参数就需要通过具名参数传递。如果其后的参数是函数类型，那么还可以通过在园括号
 * 外传递lambda表示式来传递。
 */

fun <T> convert2List(vararg element: T): List<T> {
    val result = ArrayList<T>()

    element.forEach {
        result.add(it)
    }

    return result
}

fun main() {
    println(convert2List("hello","world","Hello World"))

    var element = arrayOf("welcome","bye","test")

    println(convert2List("fdsa","fdsa",*element))
}


