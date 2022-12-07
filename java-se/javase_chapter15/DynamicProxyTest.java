package javase_chapter15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
interface Human
{
    String getBelief();

    void eat(String food);
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}

/**
 * 要想实现动态代理，需要解决问题
 * 问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
 * 问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
 */

class MyInvocationHandler implements InvocationHandler{
    //当我们通过代理类的对象调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能就声明在invoke方法中了
    private Object obj;//需要使用被代理类的对象进行赋值

    public void bind(Object obj)
    {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtil util = new HumanUtil();
        util.method1();

        //method即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj,args);
        //上述方法的返回值就作为当前类中的invoke()的返回值

        util.method2();

        return returnValue;
    }
}

class ProxyFactory{
    //调用此方法：返回一个代理类的对象，解决问题~
    public static Object getProxyInstance(Object obj)//obj:被代理类的对象
    {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);
        //代理类需要跟被代理类实现同样的接口，因此这里obj.getClass().getInterfaces()实现被代理类的接口
    }
}

class HumanUtil{
    public void method1()
    {
        System.out.println("==============通用方法==============");
    }
    public void method2()
    {
        System.out.println("==============通用方法2=============");
    }
}

public class DynamicProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //Object proxyInstance = ProxyFactory.getProxyInstance(superMan);
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        //当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        //自动地去调用MyInvocationHandler中的invoke方法
        proxyInstance.eat("四川麻辣烫");
        System.out.println("********************************");

        NikeFactory nikeFactory = new NikeFactory();
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeFactory);
        proxyClothFactory.produceCloth();
    }
}
