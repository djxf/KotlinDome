package DesignPattern


/**
 * 单例模式
 * 定义：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 懒汉式，饿汉式。
 * 延迟加载。
 *
 * 单例模式的范围：
 *      是一个ClassLoader及其子ClassLoader的范围。
 *  getInstance();
 *
 *
 * Java:
 *
 * public SingletonXXX {
 *
 * //私有构造函数
 * private SingletonXXX() {}
 *
 * public static SingletonXXX instance;
 *
 * //增加关键字 volatile
 * private static volatile SingletonXXX instance;
 *
 * //饿汉式,直接在类加载时创建实例，由虚拟机来保证只会创建一次。
 * private static SingletonXXX instance = new SingletonXXX();//空间换时间。
 *
 * //1 懒加载
 * public static SingletonXXX getInstance() {
 *      //以时间换空间
 *      if (instance == null) {
 *          instance = new SingletonXXX();
 *      }
 *      return instance;
 * }
 *
 *  //2双重校验
 *  public static SingletonXXX getInstance() {
 *      if(instance == null) {
 *          synchronized(SingletonXXX.class) {
 *              if(instance == null) {
 *                  instance == new SingletonXXX();
 *              }
 *          }
 *      }
 *      return instance;
 *  }
 * }
 *
 *
 * 考虑线程安全：
 *
 *
 */

object Singleton {
    var a = 100
}

fun main() {
    println(Singleton.a)
    Singleton.a += 100
    println(Singleton.a)
    for (i in 1..1000) {
        println(Singleton)
    }
}