package Generic;
import java.util.Scanner;
public class MyStack_<T>
{
    class Node<U>
    {//由入栈元素与下一个地址组成
        U item;
        Node<U> next;
        Node()
        {item=null;next=null;}

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean empty()
        {
            return item==null&&next==null;
        }


    }
    //push
    private Node<T> top=new Node<>();
    public void push(T item)
    {
        top=new Node<>(item,top);
    }
    public T pop()
    {
        T ret=top.item;
        if(!top.empty())
        {
            top=top.next;
        }
        return ret;
    }
    public T top()
    {
        return top.item;
    }

    public static void main(String[] args)
    {

        MyStack_<String> stack=new MyStack_<>();
        stack.push("zhangsan");
        stack.push("lisi");
        stack.push("wangwu");
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        boolean bl=true;
        MyStack_<String> stack01=new MyStack_<>();
        Scanner scanner = new Scanner(System.in);
        while(bl)
        {


            String str=scanner.next();
            stack01.push(str);
            bl=scanner.nextBoolean();

        }
        bl=scanner.nextBoolean();//true出栈，false放弃出栈
        while(bl)
        {

            stack01.pop();
            bl=scanner.nextBoolean();
        }
        System.out.println(stack01.top());
    }
}
