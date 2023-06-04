public class test_01
{
    public static void main(String[] args)
    {
        Father lisi =new Father("lisi","20000",30);
        //以下是调用的父类的方法
        lisi.say();
        lisi.eat();
        lisi.eat();
        //3、多态
        Father jack = new Son("jack", "10000", 19);
        //向上转型
        //以下调用直接看编译类型，编译类型时子类，故是调用了子类的重写方法,为动态联编
        jack.display();
        jack.eat();
        jack.say();
        //jack.play();//不能调用子类的特有方法，要采用向下转型
        Son tom = (Son) jack;
        //向下转型，可以调用子类中的特有方法
        tom.play();
        Son z = new Son("z", "2000", 18);
        System.out.println(z.getName()+"的年龄为"+z.getAge());

    }



}


