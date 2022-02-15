class Student{

    int rollNo;
    String name;
    Student(){
        rollNo=110;
        String name="Rohit";
    }

    Student(int rollNo){
        this.rollNo=rollNo;
        this.name = "Default";
    }
    Student(String name){
        this.name = name;
        this.rollNo=0;
    }
    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    protected void display(){
        System.out.println("RollNo: "+this.rollNo);
        System.out.println("Name: "+this.name);
    }

    protected int getRollNo(){
        return this.rollNo;
    }
    protected String getName(){
        return this.name;
    }
    protected void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    protected void setName(String name){
        this.name=name;
    }
}

public class Constructor {

    
    public static void main(String[] args) {
        
        Student s1=new Student(10,"Omkar");
        Student s2=new Student(20);
        Student s3=new Student("Piyush");
        Student s4=new Student();

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s2.setName("Mehul");
        s3.setRollNo(339);

        s2.display();
        s3.display();
    }
}
