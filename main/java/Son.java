
//2、继承
public class Son extends Father
{

    public Son(String name, String sla, int age)
    {

        super(name, sla, age);
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("son's eatting");

    }
    public void play()
    {
        System.out.println("I'm playing the game");
    }

    @Override
    public void display() {
        System.out.println("watch the video");
    }

    @Override
    public void say() {
        System.out.println("I want to study");
    }
}
