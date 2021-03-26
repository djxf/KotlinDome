package KotlinTest

import java.util.*

/**
 *
 * 找到包含h的字符串并输出
 *
 */
fun main() {

    val strs = arrayOf("hello", "world", "hellowrold", "welcome")
    strs.filter { it.contains("h") }.forEach{
        println(it)
    }

    strs.filter { it.length > 4 }.forEach{
        println(it)
    }

    strs.filter { it.length > 1 }.map { it.toUpperCase(Locale.ROOT) }.forEach{
        println(it)
    }
}

/**
 *
 * 在默认的情况下 lambda表示式的最后一个表示式的值会隐式的作为lambda表达式的返回值。
 * 可以通过全限定语法的return语法。
 */

/**
 * 匿名函数: 没有名字的函数
 */
/**
 * 闭包：匿名函数或者lambda可以访问作用域外层的变量。
 */