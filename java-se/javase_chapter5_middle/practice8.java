package javase_chapter5_middle;

import com.sun.org.apache.xpath.internal.operations.Or;

//类的判别：多态子类传入父类的obj类型
class Order
{
    private int orderId;
    private String orderName;
    public Order(int orderId,String orderName)
    {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Order)
        {
            return ((Order) obj).orderId == this.orderId && ((Order) obj).orderName.equals(this.orderName);
        }
        return Boolean.FALSE;
    }

}

public class practice8 {
    public static void main(String[] args) {
        Order order1 = new Order(1111,"english");
        Order order2 = new Order(1111,"chinese");
        Order order3 = new Order(1111,"english");
        System.out.println(order1.equals(order2));
        //注意这里需要调用equals方法，而不是等于符号
        System.out.println(order1.equals(order3));
    }
}
