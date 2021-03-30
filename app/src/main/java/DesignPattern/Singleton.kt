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
 * //饿汉式,直接在类加载时创建实例，由虚拟机来保证只会创建一次。线程安全。
 * private static SingletonXXX instance = new SingletonXXX();//空间换时间。
 *
 * //1 懒加载
 * public static SingletonXXX getInstance() {
 *      //以时间换空间，不同步有线程安全问题，破环了单例。
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
 *
 * 单例模式中延迟加载的思想：
 *      通俗点说，就是一开始不要加载资源或者数据，一直到马上要使用资源了才进行加载。
 *      延迟加载尽可能节约资源。
 * 缓存的思想：
 *      简单讲，如果某些资源或者数据会被频繁的使用，可以把这些数据缓存到内存里面，每次操作时，
 *      先到内存里面找，看有没有这些数据。如果有那就可以直接使用。没有就获取它。并设置到缓存中
 *      下一次的时候可以直接从内存中读取了。从而节省大量的时间，缓存是一种典型的空间换时间的方案。
 *
 *
 * 如何保证懒汉式的线程安全？
 *      public synchronized static  getInstance() {
 *            //xxx
 *      }
 *
 *
 *  public Singleton {
 *
 *      private volatile static Singleton instance;
 *
 *      private Singleton() {}
 *
 *      public static Singleton getInstance() {
 *          if (instance == null) {
 *              synchronized(Singleton.class) {
 *                  if (instance == null) {
 *                      instance == new Singleton();
 *                  }
 *              }
 *          }
 *          return instance;
 *      }
 *
 *
 *
 *  }
 *静态变量与非静态变量的区别是：
 *         静态对象被所有的对象共享，在内存中只有一个副本，它当且仅当在类初次加载时被初始化。
 *         而非静态变量是对象所拥有的。在创建对象时被初始化。存在多个副本，各个对象之间的副本相互
 *         不影响。
 * static变量存放的位置。静态区。
 *
 *
 * 静态内部类的单例模式：
 *      public Singleton {
 *          //类级的内部类，该内部类与外部类的实例没有绑定关系。而且只有被调用了才会加载，从而实现延迟加载。
 *          private static class SingletonHolder {
 *              //静态初始化器 由JVM保证线程安全
 *              private static Singleton instance = new Singleton();
 *          }
 *
 *          private Singleton(){}
 *
 *          public static Singleton getInstance() {
 *              return SingletonHolder.instance;
 *          }
 *
 *      }
 *
 *  单例和枚举：
 *      使用枚举来实现单例模式：
 *       public enum Singleton {
 *           uniqueInstance;
 *       }
 *
 *
 *   单例模式的拓展控制实例的个数。
 *         map缓存思想。
 *
 */

//kotlin的单例模式
object Singleton {
    var a = 100
}

fun main() {
    println(Singleton.a)
    Singleton.a += 100
    println(Singleton.a)
}