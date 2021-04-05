package Week3.monday;

public class App {
    public static void main(String[] args) {
        Company company1 = new Company("BL systems");
        Company company2 = new Company("BL systems");
        Department dep1 = new Department("client service", "first floor", company1);
        Department dep2 = new Department("eng. maintenance", "second floor", company1);
        company1.addDepartment(dep1);
        company1.addDepartment(dep2);

        Position pos1 = new Position("sales mannager", "It's a salesperson", dep1);
        Position pos2 = new Position("mannager", "manages the entire company", dep1);
        Position pos3 = new Position("op. mannager", "manages the operations part", dep1);

        dep1.addPosition(pos1);
        dep1.addPosition(pos2);
        dep2.addPosition(pos3);

        company1.print();

        System.out.println(company1.equals(company1));
        System.out.println(dep1.equals(dep2));
        System.out.println(pos1.equals(pos1));
        System.out.println("HashCode pos1: " + pos1.hashCode() + " HashCode pos2: " + pos2.hashCode());
        System.out.println(dep1);
        System.out.println(pos1);
        try {
            Position pos4 =  (Position) pos1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Clone pos1 vs pos1, equals:" + pos1.equals(pos1));

    }
}
