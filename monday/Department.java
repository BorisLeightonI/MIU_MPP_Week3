package Week3.monday;

import java.util.ArrayList;

public class Department {
    private String name;
    private String location;
    private Company company;
    private ArrayList<Position> positions;

    public Department(String name, String location, Company company){
        this.name = name;
        this.location = location;
        this.company = company;
        positions = new ArrayList<Position>();
    }
    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }
    public void addPosition(Position pos){
        positions.add(pos);
    }

    public void print(){
        System.out.println("\t Department name: " + name);
        for (Position position : positions) {
            position.print();
        }
    }
    @Override
    public String toString() {
        return "\t Department name: " + name + " Location: " + location;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj.getClass()!=getClass()) return false;
        Department dep = (Department) obj;
        return name.equals(dep.name)&& location.equals(dep.location)&&company.equals(dep.company)&&positions.equals(dep.positions);
    }

}
