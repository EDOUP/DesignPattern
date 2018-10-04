package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建了一个包含自己对象组的类
 * 该类提供了修改相同对象组的方式
 */
public class Employee {
    private String name;
    private String dept;
    private int salay;
    private List<Employee> subordinates;

    //构造函数
    public Employee(String name, String dept, int salay) {
        this.name = name;
        this.dept = dept;
        this.salay = salay;
        subordinates=new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salay=" + salay +
                '}';
    }
}
