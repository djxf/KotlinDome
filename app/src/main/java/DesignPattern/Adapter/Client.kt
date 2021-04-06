package DesignPattern.Adapter



fun main() {

    //1 创建需要被适配的对象
    val adaptee: Adaptee = Adaptee()

    //2 创建客户端需要的接口对象
    val adapter = Adapter(adaptee)

    //3 请求处理
    adapter.request()

}