package KotlinTest

import java.lang.Exception
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


/**
 * 提供委托：通过定义provideDelegates operator，我们可以拓展委托的创建逻辑过程。
 * 如果对象定义了provideDelegate方法，那么该方法就会被调用来创建委托实例。
 *
 *
 */
class PropertyDelegate: ReadOnlyProperty<People,String> {
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        return when(property.name){
            "name" -> "dingjian Yin"
            "address" -> "Beijing"
            else -> ""
        }
    }
}

//提供委托
class PeopleLauncher {
    operator fun provideDelegate(thisRef: People,property: KProperty<*>): ReadOnlyProperty<People,String> {
        println("welcome")//针对每个属性只执行一次？

        when(property.name) {
            "name","address" -> return PropertyDelegate()
            else -> throw Exception("not valid name")
        }
    }
}


class People {
    val name: String by PeopleLauncher()
    val address: String by PeopleLauncher()
}

fun main() {
    val p1 = People()

    println(p1.name)
    println(p1.name)
    println(p1.address)
    println(p1.address)

    //welcome
    //welcome
    //dingjian Yin
    //dingjian Yin
    //Beijing
    //Beijing

}