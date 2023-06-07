package LambdaBasic;

import java.util.function.Consumer;

public class test_04
{
    public static void go(double money,in5 i)
    {
        i.buy(money);
    }
    public static void f1(double money , Consumer cm)
    {
        cm.accept(money);
    }
    public static void main(String[] args)
    {
        go(299,new in5(){
            @Override
            //调用静态方法，并实现接口中的方法
            public void buy(double money){
            System.out.println("消费了:" + money + "元");
        }
    });


    //利用消费型接口替代in5接口
    f1(399,new Consumer<Double>(){

        @Override
        //调用静态方法，并实现接口中的方法
        public void accept(Double money) {
            System.out.println("使用消费型接口"+money);
        }
    });

    f1(499 ,x -> System.out.println("使用函数式编程的写法"+x));

    }
}


//消费：
interface in5
{
    public void buy(double money);
}

class person
{

}