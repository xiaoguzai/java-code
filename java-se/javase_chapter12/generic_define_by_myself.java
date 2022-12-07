package javase_chapter12;

import com.sun.org.apache.xpath.internal.operations.Or;

class Order<T>{
    String orderName;
    int orderId;
    //类的内部结构可以使用类的泛型
    T orderT;
    public Order(){};
    public Order(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;

    }

    public void setOrderT(T orderT)
    {
        this.orderT = orderT;
    }
    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }
}

class Suborder extends Order<Integer>
//不再是泛型类
{}

class Suborder1<T> extends Order<T>
//仍然是泛型类
{}

public class generic_define_by_myself {
    public static void main(String[] args) {
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");
        //上面调用的为错误的

        Order<String> order1 = new Order<String>("orderAA",1001,"orderAA");
        order1.setOrderT("hello");
    }
}
