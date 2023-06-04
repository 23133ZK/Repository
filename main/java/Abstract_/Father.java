package Abstract_;

abstract class Father
{
    public String name;
    public int age;

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}
