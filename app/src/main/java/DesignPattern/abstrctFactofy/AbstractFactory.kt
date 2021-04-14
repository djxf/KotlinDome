package DesignPattern.abstrctFactofy

/**
 * 抽象工厂的接口 声明创建抽象产品对象的操作
 *
 */
interface AbstractFactory {

    //示例方法创建抽象方法A的对象
    fun createProductA(): AbstractProductA

    //示例方法创建抽象方法B的对象
    fun createProductB(): AbstractProductB

}