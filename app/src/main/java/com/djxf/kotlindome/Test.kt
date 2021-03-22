package com.djxf.kotlindome

import java.util.*
import kotlin.properties.Delegates
import kotlin.reflect.KProperty


//非空属性

//notnull 适用于那些无法在初始化阶段就确定属性值的场合

class MyPerson {
    //使用前必须赋值 否则抛出异常
    var address: String by Delegates.notNull<String>()
}

/**
 * 1 延迟属性
 * 2 可观测属性
 * 3 非空属性
 * 4 map属性
 *
 */


/**
 * 可观测属性：
 *
 */

class MyPerson2 {
    var age: Int by Delegates.observable(20) { kProperty: KProperty<*>, oldValue: Int, newValue: Int ->
        println("The oldValue is $oldValue,newValue is $newValue")
    }

    var mAge: Int by Delegates.vetoable(20) {
        prop,oldValue,newValue -> when {
            oldValue <= newValue -> true
            else -> false
        }
    }
}

/**
 * map属性委托
 * Json解析，回调接口解析
 *
 * map key的名字要与类中保持一致。
 */

//构造方法参数map
class Student(map: Map<String,Any?>) {
    val name: String by map
    val address: String by map
    val age: Int by map
    val birthday: Date by map
}

class Student2(map: MutableMap<String,Any?>) {
    var address: String by map
}

fun main() {
    println("kotlin test!")
    val student: Student = Student(mapOf(
            "name" to "zhangsan",
            "address" to "beijing",
            "age" to 20,
            "birthday" to Date()
    ))

    val map = mutableMapOf<String,Any?>(
            "address" to "beijing"
    )
    val stu2 = Student2(map = map)

    println(stu2.address)

    stu2.address = "shanghai"
    println(map["address"])

}

/**
 * 关于属性委托的要求
 *  对于只读属性来说（val修饰的属性），委托需要提供一个名为getValue的方法，该方法接受如下参数
 *         --thisRef,需要的是属性拥有者的类型或者是其父类型
 *         --property，需要是Kproperty<*>类型或是其父类型
 *  getValue()方法需要返回其与属性相同类型或是其子类型。
 *
 *  委托转换规则：
 *
 */

