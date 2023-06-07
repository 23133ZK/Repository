package LambdaBasic;

public class test_03
{
    public static void main(String[] args)
    {
        in4 t1=(x,y) ->{
            System.out.println("这是一个有两个参数且有返回值的方法的方法");
            return x+y;
        };
        //多个参数不可以省略()，多个语句也不能省略{}
        //方法体中只有一个return语句时return和{ }都可以省略
        int n=t1.m4(10,20);
        System.out.println("返回x+y的值为："+n);
    }
}

@FunctionalInterface
interface in4
{
    //一个有返回值且有多个参数的方法
    public int m4(int x,int y);
    //public int m4(int y);有两个抽象方法时会编译报错
}
