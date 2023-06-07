package LambdaBasic;

public class test_02
{
    public static void main(String[] args)
    {
        in2 t1=() -> System.out.println("这是一个无参的方法m2（）。");
        //当方法体中只有一条语句时可以省略花括号{}
        t1.m2();
        in3 t2=(int num) -> System.out.println("1、这是一个有一个参数的的方法m3(),参数为："+num);
        t2.m3(18);
        //参数名字可以随便写
        //参数类型可以不加，上下文有类型推断(int num)变为（num）
        //参数只有一个时括号可以省略，可以改成如下写法：
        in3 t3= x ->System.out.println("2、这是一个有一个参数的的方法m3(),参数为："+x);
        t3.m3(20);

    }
}

interface in2
{
    public void m2();

}

interface in3
{
    public void m3(int num);
}