public class Father implements in1,in2
{
    //1、封装
    private String name;
    private String sla;
    private int age;

    public Father(String name, String sla, int age) {
        this.name = name;
        this.sla = sla;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSla(String sla) {
        this.sla = sla;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSla() {
        return sla;
    }

    public int getAge() {
        return age;
    }

    public void eat()
    {
        System.out.println("father's eatting");
    }


    //实现接口方法
    @Override
    public void display()
    {
        System.out.println("a = " + a);

    }

    @Override
    public void say()
    {
        System.out.println("I will go to work");

    }
}

//接口
interface in1
{
    final int a=10;
    void display();
}
interface in2
{
    void say();
}
