class Person{
    String Name;
    Person(){
        Name="";
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public void printPerson(){
        System.out.println("Name: "+Name);
    }
}
class Employee extends Person{
    double salary;
    int year;
    String UAN;
    Employee(){
        salary=0.0;
        year=2000;
        UAN="";
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getUAN() {
        return UAN;
    }
    public void setUAN(String uAN) {
        UAN = uAN;
    }

    public void print() {
        System.out.println("Name: "+Name);
        System.out.println("UAN: "+UAN);
        System.out.println("Year: "+year);
        System.out.println("Salary: "+salary);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Employee s1 = new Employee();
        Employee s2=new Employee();
        Person p1=new Person();
        p1.setName("Omkar Tambe");
        p1.printPerson();
        s1.setName("Rohit Naikade");
        s1.setSalary(10000.00);
        s1.setYear(2022);
        s1.setUAN("123");
        s1.print();
        s2.setName("Piyush Kobal");
        s2.setSalary(102000.00);
        s2.setYear(2022);
        s2.setUAN("456");
        s2.print();
    }
}
