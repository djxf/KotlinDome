package com.djxf.kotlindome

/**
 *
 *
 * 什么是委托属性，请简要说说其使用场景和原理?
 *      延迟属性（lazy properties）： 其值只在首次访问时计算。
 *      可观测属性(observable properties): 监听器会收到关于此属性变更的通知。
 *      把多个属性存储在一个映射（map）中，而不是每个单个存在单独的字段中。
 *      kotlin支持属性委托。
 */
class test2 {
    var p: String by Delegate()
}

interface Base {
    fun print()
}


class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

//by 关键字实现委托
class Derived(b: Base) : Base by b