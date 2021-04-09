package DesignPattern.FactoryMethod

abstract class Creator {

    /**
     * 创建Product的工厂方法
     * @return Product
     */
    protected abstract fun factoryMethod(): Product

    //示意方法，实现某些功能的方法
    public fun someOperation() {
        //通常在需要调用工厂方法来获取Product对象
        val product = factoryMethod()


    }


}