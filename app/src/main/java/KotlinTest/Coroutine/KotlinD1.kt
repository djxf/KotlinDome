package KotlinTest.Coroutine

import kotlinx.coroutines.*

/**
 * Dispatchers.Unconfined
 *
 * Dispatchers.Unconfied:协程分发器会在调用者线程去启动协程，但仅仅会持续到第一个挂起点。
 * 当挂起结束后程序恢复执行：它会继续协程代码的执行，但这时执行协程的线程是由之前所调用的挂起函数
 * 来决定的。
 *
 * Dispatchers.Unconfined适用于它既不会消耗CPU时间，同时也不会更新任何共享数据。（特定于具体的线程）
 *
 * Dispatchers.Unconfined是一种高级的机制，它对于某些特殊情况是很有帮助的：协程执行的分发是不需要的。
 * 或者会产生意料之外的副作用。
 *
 * 日常代码开发中几乎不会使用的。
 */

fun main() = runBlocking<Unit> {
        launch(Dispatchers.Unconfined) {
            println("Dispatchers.Unconfined, thread:${Thread.currentThread()}")

            delay(300)//由挂起函数来执行后续的协程代码。
            println("Dispatchers.Unconfined, thread: ${Thread.currentThread()}")
        }

        launch {
            println("No params, thread: ${Thread.currentThread()}")
            delay(2000)
            println("No params, thrad: ${Thread.currentThread()}")
        }

        withContext(Dispatchers.Unconfined) {
            println(1)
            withContext(Dispatchers.Unconfined) {
                println(2)
            }
            println(3)
        }
        println("Done")
}
