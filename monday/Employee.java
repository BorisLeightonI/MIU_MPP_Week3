package Week3.monday;

public class Employee implements Cloneable{
    private int id;
    private String firstName, middleInitial, lastName, birthDate, SSN;
    private double salary;

    public Employee(int id, String firstName, String middleInit, String lastName, String birthDate, String SSN, double salary){
        this.id = id;
        this.firstName = firstName;
        this.middleInitial = middleInit;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;
    }

    public void print(){
        System.out.println("\t Employee name: " + firstName + " lastName:" + lastName + " ID:" + id + " SSN:" + SSN + " salary:" + salary);
    }

    @Override
    public String toString() {
        return "\t Employee name: " + firstName + " lastName:" + lastName + " ID:" + id + " SSN:" + SSN + " salary:" + salary;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(obj.getClass()!=getClass()) return false;
        Employee emp = (Employee) obj;
        return firstName.equals(emp.firstName) && salary==emp.salary && id==emp.salary;
    }
    @Override
    public int hashCode() {
        return id + firstName.hashCode() + lastName.hashCode() + SSN.hashCode() + (int)salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();
        return emp;
    }

}
