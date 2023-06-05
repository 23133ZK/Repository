package Collection;
import java.util.Map;
import java.util.HashMap;
public class Map_
{
    public static void main(String[] args) {
        Student s=new Student("xiaoming",18);
        Map<String,Student> map=new HashMap<>();//创建map对象
        map.put("xiaoming",s);//将s对象映射到map上
        Student target=map.get("xiaoming");//查找map上的对象并赋值到target上面
        System.out.println(target==s);//target与s所指对象相同，返回turn
        System.out.println(target.age);//获取age
        Student s1=map.get("bob");//在map上查找bob对象，找不到，赋值null
        System.out.println(s1);//输出null


        Map<String,Integer> map1=new HashMap<>();
        map1.put("apple",123);
        map1.put("pear",456);
        System.out.println(map1.get("apple"));
        map1.put("apple",789);
        System.out.println(map1.get("apple"));//后来的apple将之前的apple的value值覆盖了

        //map的遍历
        Map<String,Integer> map2=new HashMap<>();
        map2.put("A",1);
        map2.put("B",2);
        map2.put("C",3);
        for(String key: map2.keySet())
        {
            Integer val=map2.get(key);
            System.out.println(val);
        }
        for(Map.Entry<String,Integer> entry:map2.entrySet())
        {
            String n1=entry.getKey();
            Integer va=entry.getValue();
            System.out.println(n1+" "+va);

        }


    }

}
