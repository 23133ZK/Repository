package Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Set_
{


    public static void main(String[] args) {
        Set<String> set=new HashSet<>();//无序的，可以放空元素
        set.add("apple");
        set.add("pear");
        set.add("banana");
        set.add(null);
        for(String s:set)
        {
            System.out.println(s);
        }
        Set<String> set1=new TreeSet<>();//有序的，但是不能放空元素
        set1.add("A");
        set1.add("B");
        set1.add("C");
        //set1.add(null);会出现运行异常
        for(String s:set1)
        {
            System.out.println(s);
        }
    }


}
