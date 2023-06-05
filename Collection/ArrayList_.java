package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayList_
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("sb1");
        list.add("sb2");
        list.add("sb3");
        list.add("sb1");//允许添加重复元素
        list.add("null");//允许添加null
        String str=list.get(4);
        System.out.println(list.size());//输出元素个数
        System.out.println(str);
        //list 的遍历，第一种使用for与get（）的方式来遍历
        for(int i=0;i<list.size();i++)
        {
            String s=list.get(i);
            System.out.println(s);
        }
        /*
        * 缺点：
        * 一是代码复杂，二是因为get(int)方法只有ArrayList的实现是高效的，
        * 换成LinkedList后，索引越大，访问速度越慢。
        */

        //使用迭代器来遍历
        //Iterator对象有两个方法：boolean hasNext()判断是否有下一个元素，E next()返回下一个元素。
        for(Iterator<String> it=list.iterator();it.hasNext();)
        {
            String s=it.next();
            System.out.println(s);
        }
        /*
        * 优点：
        *Iterator本身也是一个对象，但它是由List的实例调用iterator()方法的时候创建的。
        * Iterator对象知道如何遍历一个List，并且不同的List类型，
        * 返回的Iterator对象实现也是不同的，但总是具有最高的访问效率。
        *
        * */
        //可用for each形式改写成如下代码：
        for(String s:list)
        {
            System.out.println(s);
        }//此方法自动把for each循环变成一个Iterator的调用

        //List<Integer> list1 = List.of(1, 2, 5);不能用of 要jdk9才支持
        //ArrayList转化成Array
        String[] st=list.toArray(new String[5]);

        for(String s:st)
        {
            System.out.println(s);
        }

        List<father_> l2=new ArrayList<father_>();
        l2.add(new father_("zs",18));
        l2.add(new father_("ls",28));
        l2.add(new father_("ww",38));
        System.out.println(l2.contains(new father_("zs",18)));



    }



}
