package javase_chapter15;

//静态代理
interface ClothFactory{
    void produceCloth();
}
/***
 * 静态代理举例
 * 特点：代理类和被代理类在编译期间，就确定下来了
 */
class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;//就用被代理类对象进行实例化
    public ProxyClothFactory(ClothFactory factory)
    {
        this.factory = factory;
    }
    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

//被代理类
class NikeFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类的对象
        NikeFactory nike = new NikeFactory();
        //创建代理类对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }
}
