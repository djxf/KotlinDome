package DesignPattern.Adapter

class Adapter(val adaptee: Adaptee) : Target {

    override fun request() {
        //可能转调已经实现的方法进行适配
        adaptee.specificRequest()
    }
}