package Collection;
import java.util.Objects;
public class father_ {

        public String name;
        public int age;

        public father_(String name, int age) {
            this.name = name;
            this.age = age;
        }

    /*public boolean equals(Object o)
    {
        if(o instanceof father_)
        {

            boolean N=false;
            if(this.name==null&&((father_) o).name==null)
                N=true;
            if(this.name!=null)
                N=((father_) o).name.equals(this.name);
            return N&&((father_) o).age==this.age;
        }
        return false;
    }*/

    //重写equals方法
    public boolean equals(Object o) {
        if(o instanceof father_){
            father_ p = (father_) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }

}
