package Week3.monday;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name){
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void print(){
        System.out.println("Company name: " + name);
        for (Department department : departments) {
            department.print();
        }
    }

    public void addDepartment(Department dep){
        departments.add(dep);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj.getClass()!=getClass()) return false;
        Company comp = (Company) obj;
        return name.equals(comp.name)&&departments.equals(comp.departments);
    }
    
}
