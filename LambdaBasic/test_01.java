package LambdaBasic;

public class test_01
{
    public static void main(String[] args)
    {
        //创建接口实现类的对象
        in1 t=new MyClass();//使用实现了接口的类做运行类型，接口做编译类型，语法运行通过
        t.m1();
        in1 t1=new in1() {
            @Override
            public void m1() {
                System.out.println("重写了m1()的方法，使用匿名内部类的方式实现接口的方法");
            }
        };
        t1.m1();

        in1 t2=() -> System.out.println("重写了m1()的方法，使用Lambda表达式的写法");
        t2.m1();
    }
}

interface in1
{
    public void m1();
}
class MyClass implements in1
{
    @Override
    public void m1()
    {
        System.out.println("使用传统方法定义类实现接口后实现了m1()方法。。。");
    }

}


