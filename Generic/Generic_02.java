package Generic;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;
public class Generic_02
{

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("zhangsan");
        al.add("lisi");
        al.add("wangwu");
        MyStack<String> s=new MyStack<String>(al);
        System.out.println(s.top());//wangwu
        s.pop();//remove wangwu
        System.out.println(s.top());//lisi
        s.push("Alex");//push Alex
        System.out.println(s.top());//Alex
        Stack s1=new Stack();

    }
}


//模拟stack栈的实现
//思路：采用数组来模拟栈的实现，pop方法出栈，push方法入栈，返回栈顶元素top方法
//用数组的[0]作为最开始的栈顶，元素不断入栈只能入到最上面的空间，且每次出栈也只能从栈顶出去
/*class MyStack<T>
{
    public T[] arr;
    //private T[] array;

    public MyStack(T[] arr) {
        this.arr = arr;
    }
    //入栈（方法名：push）
    public T[] push(T x)
    {
        Object[] obj=new Object[arr.length];
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            obj[i]=arr[i];
        }
        obj[i]=x;
        return (T[])obj;

    }

    //出栈（方法名：pop）
    public T[] pop()
    {
        Object[] obj=new Object[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
            obj[i]=arr[i];
        }
        return (T[])obj;
    }

    //返回栈顶元素（方法名：top）
    public T top()
    {
        T y=this.arr[arr.length-1];
        return y;
    }
}*/

//使用数组不好对原数组进行删除元素
//故采用ArrayList进行模拟栈
class MyStack<T>
{
    public ArrayList<T> al=new ArrayList<>();

    public MyStack(ArrayList<T> al) {
        this.al = al;
    }

    //入栈push
    @Test
    public void push(T t)
    {
        al.add(t);
    }
    //出栈pop
    @Test
    public void pop()
    {
        al.remove(al.size()-1);
    }
    @Test
    public T top()
    {
        return al.get(al.size()-1);
    }

}

