package cn.net.sdkd;

/**
 * Created by leehaoze on 16/10/20.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Teacher {
    private int no, age;
    private String name,seminary;

    public Teacher(){
        no = 0;
        age = 0;
        name = "NULL";
        seminary = "NULL";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeminary() {
        return seminary;
    }

    public void setSeminary(String seminary) {
        this.seminary = seminary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Teacher)) return false;
        final Teacher teacher = (Teacher)obj;
        if(getNo() != teacher.getNo())return false;
        return true;
    }

    @Override
    public String toString() {
        return "编号为" + getNo() + "、" + "姓名为" + getName() + "、" + "年龄为" + getAge() + '的'  + getSeminary() + "学院老师" ;
    }


}

class SortByNo implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getNo() - o2.getNo();
    }
}