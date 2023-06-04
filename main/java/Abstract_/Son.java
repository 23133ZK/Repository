package Abstract_;

public class Son extends Father
{


    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println(name+"要吃饭了");
    }
}
