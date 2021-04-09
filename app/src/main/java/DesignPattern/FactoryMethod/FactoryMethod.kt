package DesignPattern.FactoryMethod


/**
 * 工厂方法：
 *      定义一个用于创建对象的接口，让子类决定实例化哪一个类，FactoryMethod使一个的
 *      实例化延迟到其子类。
 *
 * 例子：
 *      Product:定义工厂方法所创建对象的接口，也就是实际需要使用的对象的接口。
 *      ConcreteProduct：具体的Product接口的实现对象。
 *      Creator：创建器，声明工厂方法。
 *      ConcreteCreator：具体的创建器对象，覆盖实现Createor的定义的工厂方法，返回具体的Product
 *      实例。
 *
 *
 *      简单工厂存在的问题：
 *              *工厂类集中了所有产品的创建逻辑。一旦工厂不能正常工作，整个系统都会收到影响。
 *              *违背开闭原则，一旦添加新产品，必须修改整个工厂类的逻辑。
 *              *使用了静态工厂方法，继承结构上有问题。
 *
 *
 *
 *
 */
