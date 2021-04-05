package Week3.monday;

import java.util.ArrayList;

public class Position implements Cloneable{
    private String title;
    private String description;
    private ArrayList<Employee> employees;
    private Department dep;

    public Position(String title, String desciption, Department dep){
        this.title = title;
        this.description = desciption;
        employees = new ArrayList<Employee>();
        this.dep = dep;
    }
    public String getDescription() {
        return description;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public String getTitle() {
        return title;
    }

    public void addEmployees(Employee emp){
        employees.add(emp);
    }
    
    public void print(){
        System.out.println("\t\t Position name: " + title);

    }

    @Override
    public String toString() {
        return "\t Position name: " + title + " Description: " + description + " has " + employees.size() + " employees at the moment.";
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj.getClass()!=getClass()) return false;
        Position pos = (Position) obj;
        return title.equals(pos.title)&&description.equals(pos.description)&&employees.equals(pos.employees);
    }
    @Override
    public int hashCode() {
        return title.hashCode()+description.hashCode()+employees.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Position pos= (Position) super.clone();
        return pos;
    }

}
