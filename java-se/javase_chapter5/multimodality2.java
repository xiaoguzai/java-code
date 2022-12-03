package javase_chapter5;

/***
 * class Person{
 *     protected String name = "张三";
 *     protected int age;
 *     public String getInfo()
 *     {
 *         return "Name: "+name+"\nage:"+age;
 *     }
 * }
 *
 * class Student extends Person{
 *     protected String name = "李四";
 *     private String school = "New Oriental";
 *     public String getSchool(){
 *         return school;
 *     }
 *     public String getInfo(){
 *         return super.getInfo()+"\nschool:"+school;
 *     }
 * }
 */
public class multimodality2 {
    public void method(Person e)
    //Person为父类
    {
        if(e instanceof Student)
        //Student为子类
        {
            Student me = (Student) e;//将e强制转换为Student类型
            System.out.println(me.getSchool());//输出New Oriental
        }
    }

    public static void main(String[] args) {
        multimodality2 t = new multimodality2();
        Student m = new Student();
        t.method(m);//method调用上面的method方法
        //运行结果：New Oriental
        //这里说明父类 instanceof 子类可以调用成功
    }
}
