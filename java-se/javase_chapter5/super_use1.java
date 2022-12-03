package javase_chapter5;

class Person{
    protected String name = "张三";
    protected int age;
    public String getInfo()
    {
        return "Name: "+name+"\nage:"+age;
    }
}

class Student extends Person{
    protected String name = "李四";
    private String school = "New Oriental";
    public String getSchool(){
        return school;
    }
    public String getInfo(){
        return super.getInfo()+"\nschool:"+school;
    }
}

public class super_use1 {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.getInfo());
    }
    /**运行结果：之前的输入加上现在的结果
     * Name：张三
     * age:0
     * school:New Oriental
     */
}
