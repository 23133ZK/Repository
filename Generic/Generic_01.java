package Generic;

public class Generic_01
{
    public static void main(String[] args) {

        //泛型的使用在复杂对象加上尖括号后，尖括号里面包含的内容被指定了，这就是泛型
        //在集合中 List<Person> list=new ArrayList<Person>();
        //就是被指定只能传Person进去，确保了程序的安全性
        Person<String> p=new Person<>("zhangsan");
        p.show();
    }
}

class Person<E>
{
    private E e;

    public Person(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    public void show()
    {
        System.out.println(getE());
    }
}


